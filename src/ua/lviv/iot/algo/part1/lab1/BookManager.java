package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import ua.lviv.iot.algo.part1.lab1.Book;
    @ToString
    public class BookManager {

        private List<Book> listOfBooks = new ArrayList<>();

        public List<Book> getListOfBooks() {
            return this.listOfBooks;
        }

        public void addBooks(Book book) {
            this.listOfBooks.add(book);
        }

        public List<Book> findByYear(int year) {
            List<Book> newList = new ArrayList<>();
            newList = (ArrayList<Book>) listOfBooks.stream()
                    .filter(book -> book.getPublishingYear() == year)
                    .collect(Collectors.toList());
            if (newList.isEmpty()) {
                throw new IllegalArgumentException("Now matches were found");
            } else {
                return newList;
            }
        }

        public List<Book> findByAuthor(String author) {
            List<Book> newList = new ArrayList<>();
            newList = (ArrayList<Book>) listOfBooks.stream()
                    .filter(book -> book.getAuthor() == author)
                    .collect(Collectors.toList());
            if (newList.isEmpty()) {
                throw new IllegalArgumentException("Now matches were found");
            } else {
                return newList;
            }
        }

        public static void main(String[] args) {
            BookManager manager = new BookManager();
            PaperBook mathBook = new PaperBook(
                    "Math 6th grade", "Merzlyak",
                    "Ukrainian government",
                    "Educational", 2016, 20);
            AudioBook HistoryOfUkraine = new AudioBook(
                    "History of Ukraine", "Baranovska " ,
                    "LPNU", "Educational", 2010);
            ElectronicBook englishDictionary = new ElectronicBook("Englis Dictionary for youngsters", "Hehelen",
                    "LNU", "Educational", 2023, 2048);
            InteractiveBook adventuresOfIndianaJohnes = new InteractiveBook("The Last Adventure of Indiana Jones",
                    "Pavlo ", "Ababagalamaga", "Fiction", 2023, 3098);
            manager.addBooks(mathBook);
            manager.addBooks(HistoryOfUkraine);
            manager.addBooks(englishDictionary);
            manager.addBooks(adventuresOfIndianaJohnes);
            for (Book book: manager.listOfBooks) {
                System.out.println(book);
            }
        }

    }

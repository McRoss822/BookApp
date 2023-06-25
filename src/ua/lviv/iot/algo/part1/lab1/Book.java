package src.ua.lviv.iot.algo.part1.lab1;

import lombok.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    protected String title;
    protected String author;
    protected String publisher;
    protected String genre;
    protected int year;

    public static Book getInstance() {
        Book book = new Book();
        return book;
    }

    public static void main(String[] args) {
        List list = new LinkedList();
        Book book1 = new Book("Math 6th grade", "Merzlyak",
                "Ukrainian government", "Educational", 2016);
        Book book2 = new Book();
        Book book3 = getInstance();
        Book book4 = getInstance();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        Iterator var6 = list.iterator();

        while(var6.hasNext()) {
            Object b = var6.next();
            System.out.println(b);
        }

    }
    
}



package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {

   private static Book instance= new Book();
   static Book getInstance(){
       return instance;
    }

    public int getBook(int quantity) {
       if( this.hasMoreBooks()!=false) {
       return quantity;
       }
       else return 0;

    }

    public boolean hasMoreBooks(){
        if(this.countInWareHouse!=0){
            return true;
        }
        else
            return false;
    }
   
    private String title;
    private String author;
    private String publisher;
    private String genre;
    private int year;
    private int countInWareHouse;

    public static void main(String[] args) {
       Book[] listOfBooks;
       listOfBooks=new Book[3];
       listOfBooks[0]=new Book("Catcher in the Rye", "J.D.Sallinger","Little,Brown",
               "Realistic Fiction",1951,23);
       listOfBooks[1]=instance.getInstance();
       listOfBooks[2]=new Book();

        for (Book books:listOfBooks) {
            System.out.println(books);
        }
    }

}

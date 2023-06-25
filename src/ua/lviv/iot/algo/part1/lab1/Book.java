package ua.lviv.iot.algo.part1.lab1;
import lombok.*;

@AllArgsConstructor
@Setter
@NoArgsConstructor
@Getter
public abstract class Book {
    public abstract int getLength();
    protected String title;
    protected String author;
    protected String publisher;
    protected String genre;
    protected int year;
    public final int bytesPerPageCount = 16;
    public int getPublishingYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }
}

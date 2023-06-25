package ua.lviv.iot.algo.part1.lab1;

public class PaperBook extends Book{
    public PaperBook(final String title, final String author,
                     final String publisher, final String genre,
                     final int year, final int pagesCount) {
        super(title, author, publisher, genre, year);
        this.pagesCount = pagesCount;
    }

    @Override
    public int getLength() {
        return this.pagesCount;
    }

    private int pagesCount;
}

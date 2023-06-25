package ua.lviv.iot.algo.part1.lab1;

public class AudioBook extends Book{
    public AudioBook(final String title, final String author,
                     final String publisher,
                     final String genre, final int year) {
        super(title, author, publisher, genre, year);
    }

    private int lengthInMinutes;

    @Override
    public int getLength() {
        return this.lengthInMinutes;
    }

}




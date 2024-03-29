package ua.lviv.iot.algo.part1.lab1;

public class InteractiveBook extends Book{
    public InteractiveBook(final String title, final String author,
                           final String publisher,
                           final String genre, final int year,
                           final long fileSizeInBytes) {
        super(title, author, publisher, genre, year);
        this.fileSizeInBytes = fileSizeInBytes;
    }

    private long fileSizeInBytes;

    @Override
    public int getLength() {
        return (int) (fileSizeInBytes / bytesPerPageCount);
    }
}

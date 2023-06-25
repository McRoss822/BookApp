package ua.lviv.iot.algo.part1.lab1;

public class ElectronicBook extends Book{
    public ElectronicBook(final String title, final String author,
                          final String publisher,
                          final String genre, final int year,
                          final long fileSizeInBytes) {
        super(title, author, publisher, genre, year);
        this.fileSizeInBytes = fileSizeInBytes;
    }

    @Override
    public int getLength() {
        return (int) (fileSizeInBytes / bytesPerPageCount);
    }

    private long fileSizeInBytes;
}

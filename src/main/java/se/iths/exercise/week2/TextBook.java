package se.iths.exercise.week2;

public class TextBook {

    private final String[] pages;
    private int pageCount;

    public TextBook() {
        pages = new String[10];
    }

    public TextBook(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Numbers of pages must be greater than 0");
        }
        pages = new String[size];
    }

    public void addPage(String text) {

    }

    public int count() {
        return pageCount;
    }

    public String getPage(int page) {
        if( page < 0 || page >= pageCount)
            return "";
        return pages[page];
    }

    public static void main(String[] args) {
        TextBook defaulSize = new TextBook();
        TextBook customSize = new TextBook(20);

    }
}

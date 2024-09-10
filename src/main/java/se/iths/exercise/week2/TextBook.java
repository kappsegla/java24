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

        if (pageCount >= pages.length) {
            throw new IllegalStateException("No empty pages in book.");
        }
        pages[pageCount++] = text;
    }

    public int count() {
        return pageCount;
    }

    public String getPage(int page) {
        if (page < 0 || page >= pageCount)
            return "";
        return pages[page];
    }

    public static void main(String[] args) {
        TextBook defaulSize = new TextBook();
        TextBook customSize = new TextBook(20);
        defaulSize.addPage("Hello World");
        defaulSize.addPage("World");
        defaulSize.addPage("More text on page");
        defaulSize.addPage("This is a simple text book");
        defaulSize.addPage("This is a simple text book with a cat in it");
        defaulSize.addPage("This is a simple text book with a cat");
        defaulSize.addPage("This is a simple text book with a cat");
        defaulSize.addPage("This is a simple text book with a cat");
        defaulSize.addPage("This is a simple text book with a cat");
        defaulSize.addPage("This is a simple text book with a cat");
        defaulSize.addPage("Beyond the end");

        customSize.addPage("Hello World");
        System.out.println(defaulSize.count());
        System.out.println(customSize.count());
        System.out.println(defaulSize.getPage(0));
        System.out.println(defaulSize.getPage(1));
    }
}

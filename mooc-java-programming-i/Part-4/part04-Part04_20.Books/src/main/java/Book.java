import java.time.Year;

public class Book {
    private String title;
    private int pages;
    private Year publicationYear;

    public Book(String title, int pages, Year publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public Year getPublicationYear() {
        return this.publicationYear;
    }

    public String toString() {
        return getTitle() + ", " + getPages() + " pages, " + getPublicationYear();
    }
}

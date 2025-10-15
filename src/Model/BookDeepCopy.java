package Model;

import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy implements Cloneable {

    private String title;
    private String author;
    private List<String> chapters;

    public BookDeepCopy(String title, String author, List<String> chapters) {
        this.title = title;
        this.author = author;
        this.chapters = chapters;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public List<String> getChapters() { return chapters; }
    public void setChapters(List<String> chapters) { this.chapters = chapters; }

    @Override
    public Object clone() {
        try {
            BookDeepCopy clonedBook = (BookDeepCopy) super.clone();
            // Deep copy of mutable list
            clonedBook.chapters = new ArrayList<>(this.chapters);
            return clonedBook;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return "BookDeepCopy {" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}

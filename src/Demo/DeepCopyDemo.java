package Demo;

import Model.BookDeepCopy;
import java.util.ArrayList;
import java.util.List;

public class DeepCopyDemo {
    public static void main(String[] args) {
        System.out.println("===== Deep Copy Demonstration =====");

        List<String> chapters = new ArrayList<>();
        chapters.add("Introduction");
        chapters.add("Builder Pattern");

        BookDeepCopy originalBook = new BookDeepCopy("Clean Code", "Robert C. Martin", chapters);
        BookDeepCopy clonedBook = (BookDeepCopy) originalBook.clone();

        System.out.println("\nBefore Modification:");
        printBooks(originalBook, clonedBook);

        originalBook.getChapters().add("Factory Pattern");

        System.out.println("\nAfter Modifying Original Book's Chapters:");
        printBooks(originalBook, clonedBook);

        System.out.println("\nObservation:");
        System.out.println("→ The cloned book remains unchanged because a new list of chapters was created (deep copy).");
        System.out.println("→ Both books are now completely independent.\n");
    }

    private static void printBooks(BookDeepCopy original, BookDeepCopy clone) {
        System.out.println("Original Book : " + original);
        System.out.println("Cloned Book   : " + clone);
    }
}

package Demo;

import Model.BookShallowCopy;
import java.util.ArrayList;
import java.util.List;

public class ShallowCopyDemo {
    public static void main(String[] args) {
        System.out.println("===== Shallow Copy Demonstration =====");

        List<String> chapters = new ArrayList<>();
        chapters.add("Introduction");
        chapters.add("Design Patterns Overview");

        BookShallowCopy originalBook = new BookShallowCopy("Design Patterns", "Gamma et al.", chapters);
        BookShallowCopy clonedBook = (BookShallowCopy) originalBook.clone();

        System.out.println("\nBefore Modification:");
        printBooks(originalBook, clonedBook);

        originalBook.getChapters().add("Prototype Pattern");

        System.out.println("\nAfter Modifying Original Book's Chapters:");
        printBooks(originalBook, clonedBook);

        System.out.println("\nObservation:");
        System.out.println("→ Both books reflect the same change because they share the same chapters list (shallow copy).");
        System.out.println("→ Only object structure is cloned, not internal data.\n");
    }

    private static void printBooks(BookShallowCopy original, BookShallowCopy clone) {
        System.out.println("Original Book : " + original);
        System.out.println("Cloned Book   : " + clone);
    }
}

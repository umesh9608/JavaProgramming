package Assignment12;

import java.util.ArrayList;

class LibrarySystem {
    String title;
    String author;
    int isbn;

    public LibrarySystem(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void showBookDetails() {
        System.out.println("title:" + title + ", Author:" + author + ",ISBN:" + isbn);
    }
}

class library {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(3);

        //add element
        list.add(1, 1);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);
    }
}

//method to add book
//method to removebook;
//method to list all book
//new method to find a book by its isbn



/* 2. Library System
 Problem Description:
o Design a Book class with attributes title, author, and isbn. Create a
Library class that manages a collection of Book objects. Implement methods
to add new books, remove books by ISBN, and list all books.
 Solution Approach:
o Start by creating the Book class, then build the Library class with an internal
list to store Book objects. Use methods to manage the collection (add, remove,
list). Test the system by adding/removing multiple books.
 Test Cases:
1. Test Case 1:
 Input: Add three books with unique ISBNs.
 Expected Outcome: Library lists all three books.
2. Test Case 2:
 Input: Remove a book by its ISBN.
 Expected Outcome: Book is removed from the list.
3. Test Case 3:
 Edge Case: Try removing a book not in the library.
 Expected Outcome: Error message (Book not found).
4. Test Case 4:
 Input: Add a book with an already existing ISBN.
 Expected Outcome: Error message (Duplicate ISBN).
5. Test Case 5:
 Input: List books when the library is empty.
 Expected Outcome: Message indicating no books available.
 */
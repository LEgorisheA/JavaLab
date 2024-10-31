package lab4;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Student() {
        name = "StudentName";
        borrowedBooks = new ArrayList<Book>();
    }

    public Student(String studentName, ArrayList<Book> books) {
        borrowedBooks = books;
        name = studentName;
    }

    public ArrayList<Book> getBooks() {
        return borrowedBooks;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

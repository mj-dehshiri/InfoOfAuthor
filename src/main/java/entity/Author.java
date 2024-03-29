package entity;
import java.util.Arrays;
import entity.Book;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private Book[] books;

// constructor


    public Author() {
    }

    public Author(int id, String firstName, String lastName, int age, Book[] books) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }

    public Author(String firstName, String lastName, int age, Book[] books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.books = books;
    }

//getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}


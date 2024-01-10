package entity;

public class Book {

    private int id;
    private String name;
    private int yearOfPrint;
    private  int authorId;

    //constructor


    public Book() {
    }

    public Book(int id, String name, int yearOfPrint, int author) {
        this.id = id;
        this.name = name;
        this.yearOfPrint = yearOfPrint;
        this.authorId = author;
    }

    public Book(String name, int yearOfPrint, int authorId) {
        this.name = name;
        this.yearOfPrint = yearOfPrint;
        this.authorId = authorId;
    }
    //setter and getter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPrint() {
        return yearOfPrint;
    }

    public void setYearOfPrint(int yearOfPrint) {
        this.yearOfPrint = yearOfPrint;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfPrint='" + yearOfPrint + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}

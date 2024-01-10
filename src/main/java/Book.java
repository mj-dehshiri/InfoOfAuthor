public class Book {

    private int id;
   private String name;
   private String yearOfPrint;
   private  Author author;

   //constructor


    public Book() {
    }

    public Book(int id, String name, String yearOfPrint, Author author) {
        this.id = id;
        this.name = name;
        this.yearOfPrint = yearOfPrint;
        this.author = author;
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

    public String getYearOfPrint() {
        return yearOfPrint;
    }

    public void setYearOfPrint(String yearOfPrint) {
        this.yearOfPrint = yearOfPrint;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfPrint='" + yearOfPrint + '\'' +
                ", author=" + author +
                '}';
    }
}

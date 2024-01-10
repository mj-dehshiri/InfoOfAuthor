public class Book {
   private String name;
   private String yearOfPrint;
   private  Author author;

   //constructor


    public Book() {
    }

    public Book(String name, String yearOfPrint, Author author) {
        this.name = name;
        this.yearOfPrint = yearOfPrint;
        this.author = author;
    }

    //setter and getter

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
                "name='" + name + '\'' +
                ", yearOfPrint='" + yearOfPrint + '\'' +
                ", author=" + author +
                '}';
    }
}

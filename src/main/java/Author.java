public class Author {
   private String firstName;
   private String lastName;
   private int age;
   private String[] books;

// constructor


   public Author() {
   }

   public Author(String firstName, String lastName, int age, String[] books) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.books = books;
   }

   //getter and setter

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

   public String[] getBooks() {
      return books;
   }

   public void setBooks(String[] books) {
      this.books = books;
   }
}

public class Book
{
   String title;
   int pages;
   String author;
   String coverColor;
   String isbn;

   //construktor für alle Werte -> ALlArgsConstruktor

   public Book (String title, int pages, String author, String coverColor, String isbn)
   {
      this.title = title;
      this.pages = pages;
      this.author = author;
      this.coverColor = coverColor;
      this.isbn = isbn;
   }

   //Default Constructor -> noArgsConstruktor
   public Book ()
   {

   }

}

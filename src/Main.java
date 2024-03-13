public class Main
{
    public static void main(String[] args)
    {
       Book barbarasBook = new Book();
       barbarasBook.title = "Algorithmen und Datenstrukturen!";
       barbarasBook.pages = 507;
       barbarasBook.author = "Kai Uwe Sattler";
       barbarasBook.coverColor = "GRau";
       barbarasBook.isbn = "3-8956-669-0";



       Book deansbook = new Book("JAva für Dummies!", 463, "Kai Uwe Sattler", "GElb", "9785-3-5257-25897-0");

        String book1title = "Das Merk ich mir!";
        int book1Pages = 383;
        String book1Author = "Brown Roediger III McDaniel";
        String book1COverColor = "White";
        String book1isbn = "973-3-442, 17850-6";

        String book2title = "Algorithmen und Datenstrukturen!";
        int book2Pages = 507;
        String book2Author = "Kai Uwe Sattler";
        String book2COverColor = "Grau";
        String book2isbn = "3-8956-669-0";

        String book3title = "JAva für Dummies!";
        int book3Pages = 463;
        String book3Author = "Berr Bird";
        String book3COverColor = "GElb";
        String book3isbn = "9785-3-5257-25897-0";

        printBookInfos (barbarasBook);
        printBookInfos(deansbook);
    }

    public static void printBookInfos (Book book )
    {
        System.out.println( "das Buch ist "+ book.title + " mit pages " + book.pages + " und Author ist: " + book.author + " COver ist " + book.coverColor);
    }
}

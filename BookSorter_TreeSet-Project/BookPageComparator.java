package collectionsOdevProjeleriPatikaDev.KitapSiralayici;
import java.util.Comparator;

public class BookPageComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getPage()-book2.getPage(); // Büyük olan değeri döndürür
    }
}

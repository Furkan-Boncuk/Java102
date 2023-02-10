package collectionsOdevProjeleriPatikaDev.KitapSiralayici;
import java.util.Comparator;
import java.util.Date;

public class Book implements Comparable<Book>{
    private String bookName;
    private int page;
    private String authorName;
    private int releaseDate;

    public Book(String bookName, int page, String authorName, int releaseDate) {
        this.bookName = bookName;
        if(0<page){
            this.page = page;
        }else{
            this.page = -1;
        }
        this.authorName = authorName;
        this.releaseDate = releaseDate;
    }

    @Override
    public int compareTo(Book otherBook) {
        return this.bookName.compareTo(otherBook.getBookName());
    }

    public int compareTo(Book book1, Book book2){
        return Integer.compare(book1.getPage(),book2.getPage());
    }

    //Getters
    public String getBookName() {
        return bookName;
    }

    public int getPage() {
        return page;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }
}

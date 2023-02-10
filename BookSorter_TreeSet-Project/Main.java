package collectionsOdevProjeleriPatikaDev.KitapSiralayici;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> bookListByBookName = new TreeSet<>();
        bookListByBookName.add(new Book("Otomatik Portakal",320,"Anthony Burgess",1962));
        bookListByBookName.add(new Book("Denizler Altında Yirmi Bin Fersah",180,"Jules Verne",1870));
        bookListByBookName.add(new Book("Nutuk",450,"Mustafa Kemal Atatürk",1927));
        bookListByBookName.add(new Book("Zamanın Kısa Tarihi",260,"Stephen Hawking",1988));
        bookListByBookName.add(new Book("Ethereum İnşaası",370,"Vitalik Buterin",2022));

        System.out.println("Sorted By Name: ");
        int i = 0;
        for(Book book : bookListByBookName){
            i++;
            System.out.println(i+"."+book.getBookName()+" - "+book.getPage()+" - "+book.getAuthorName()+" - "+book.getReleaseDate());
        }

        TreeSet<Book> bookListByPage = new TreeSet<>(new BookPageComparator().reversed());
        bookListByPage.addAll(bookListByBookName);
        i = 0;
        System.out.println("\nSorted By Page: ");
        for(Book book : bookListByPage){
            i++;
            System.out.println(i+"."+book.getBookName()+" - "+book.getPage()+" - "+book.getAuthorName()+" - "+book.getReleaseDate());
        }

    }
}

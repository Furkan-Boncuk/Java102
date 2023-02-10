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

        for(Book book : bookListByBookName){
            System.out.println(book.getBookName());
        }

        TreeSet<Book> bookListByPage = new TreeSet<>(new BookPageComparator());
        bookListByPage.addAll(bookListByBookName);

        for(Book book : bookListByPage){
            System.out.println(book.getPage());
        }

    }
}

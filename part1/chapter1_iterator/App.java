package part1.chapter1_iterator;

public class App {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("shang"));
        bookShelf.appendBook(new Book("Chen"));
        bookShelf.appendBook(new Book("symbol"));
        bookShelf.appendBook(new Book("Wu"));
        Iterator iterator = bookShelf.iterator();

        while(iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}

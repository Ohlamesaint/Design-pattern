package iterator;

public class BookShelfIterator implements Iterator{

    public BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){              // 藉此獲取與 bookshelf 集合的關係
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next() {                                      // 獲取目前book，並將index推進至下一個
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}

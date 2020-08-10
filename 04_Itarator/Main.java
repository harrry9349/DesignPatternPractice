public class Main{
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf(6);
        bookShelf.appendBook(new Book("人間失格"));
        bookShelf.appendBook(new Book("沈黙"));
        bookShelf.appendBook(new Book("重力ピエロ"));
        bookShelf.appendBook(new Book("容疑者Xの献身"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("こころ"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
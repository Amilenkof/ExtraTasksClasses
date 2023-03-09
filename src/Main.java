public class Main {
    public static Book bookArr[]= new Book[10];
    public  static boolean addBook(String title,int page) {
        Book book1 = new Book(title, page);
        for (int i = 0; i < bookArr.length; i++) {
            if (bookArr[i]==null) {
                bookArr[i]=book1;
                return true;
            }
        }
        return false;
    }
    public  String toString(Book book) {
        return " название " + book.getTitle() + " страниц " + book.getPage();

    }
    public static void print () {
        for (int i = 0; i < bookArr.length; i++) {
            System.out.println(bookArr[i].toString());
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");


    bookArr[0]= new Book("Гарри поттер 1 ", 300) ;
    bookArr[1]= new Book("Гарри поттер 2 ", 300) ;
    bookArr[2]= new Book("Гарри поттер 3 ", 300) ;
    addBook("Гарри потный ", 30312) ;
    addBook("Гарри потный ", 30312) ;
    addBook("Гарри потный ", 30312) ;
    addBook("Гарри потный ", 30312) ;
    addBook("Гарри потный ", 30312) ;
    addBook("Гарри потный ", 30312) ;
    addBook("Гарри потный ", 30312) ;
    addBook("Гарри потный ", 30312) ;
    addBook("Гарри потный ", 30312) ;
        print();

    } }

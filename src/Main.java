public class Main {
    public static Book bookArr[]= new Book[10];
    public  static boolean addBook(String title,int page,int year) {
        Book book1 = new Book(title, page,year);
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
            if (bookArr[i]!=null)
            System.out.println(bookArr[i].toString());
        }
    }
    public static void main(String[] args) {



    bookArr[0]= new Book("Гарри поттер 1 ", 300,2000) ;
    bookArr[1]= new Book("Гарри поттер 2 ", 300,2001) ;
    bookArr[2]= new Book("Гарри поттер 3 ", 300,2002) ;
    addBook("Гарри потный - боевик ", 30312,2023) ;

        print();

    } }

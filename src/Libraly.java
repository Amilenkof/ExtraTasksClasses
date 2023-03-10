import java.util.Arrays;

public class Libraly {
    private   Book bookArr[] = new Book[10];

    public  Libraly (int lenght) {
        Libraly [] libraly= new Libraly[lenght];

    }
    public void write () {
        bookArr[0] = new Book("Гарри поттер 1 ", 300, 2000);
        bookArr[1] = new Book("Гарри поттер 2 ", 300, 2001);
        bookArr[2] = new Book("Гарри поттер 3 ", 300, 2002);
    }
    public  boolean addBook(String title, int page, int year) {
        Book book1 = new Book(title, page, year);
        for (int i = 0; i < bookArr.length; i++) {
            if (bookArr[i] == null) {
                bookArr[i] = book1;
                return true;
            }
        }
        return false;
    }
    public void printBook (String title) {
        for (int i = 0; i < bookArr.length; i++) {
            if (bookArr[i] != null && bookArr[i].getTitle().equals(title)) {
                System.out.println("Запрошенная книга "+ bookArr[i].toString());
            }
        }}




    public  void print() {
        for (int i = 0; i < bookArr.length; i++) {
            if (bookArr[i] != null)
                System.out.println(bookArr[i].toString());
        }
    }
    public void setYearOfBook (String title,int year) {
        for (int i = 0; i < bookArr.length; i++) {
            if (bookArr[i]!=null && bookArr[i].getTitle().equals(title)) {
                bookArr[i].setYear(year);

            }
        }
    }


}

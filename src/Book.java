public class Book {
    public String title;
    public int page;
    public int year;

    public Book(String title, int page, int year) {
        this.title = title;
        this.page = page;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", page=" + page +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }
}

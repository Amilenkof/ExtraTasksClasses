public class Book {
    public String title;
    public int page;

    public Book(String title, int page) {
        this.title = title;
        this.page = page;
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

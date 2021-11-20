package beans;

import org.springframework.stereotype.Component;

@Component //ori asta ori cu bean
public class Book {
    private String title;
    private String author;

    //public Book(String title, String author) {
      //  this.title = title;
        //this.author = author;
    //} daca decomentez constructorul nu va mai merge

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

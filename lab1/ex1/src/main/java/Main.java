import beans.Book;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = //zona in memorie ce contine componentele
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        // doua posibilitati de a lua beanul
        //1 dupa nume trebuie sa pun si clasa in fata ()
        // 2 dupa clasa
        //Book book = (Book) context.getBean("b1");
        //bean da full control asupra definirii beanului, asupra el sale
        //comp este mult mai restrictiv asupra creeri beanului

        Book book = context.getBean(Book.class);
        System.out.println(book);
    }
}

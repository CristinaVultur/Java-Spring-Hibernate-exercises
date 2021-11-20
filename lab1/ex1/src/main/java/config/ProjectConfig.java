package config;
//prin mine poti configura beanurile

import beans.Book;
import beans.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = {"beans"}) //ori asta ori scriu aici @bean
public class ProjectConfig {

   /* @Bean
    public Book b1(){
        return new Book("book 1", "Author 1");
    }
    @Bean
    public Book b2(){
        return new Book("book 2", "Author 2");
    }
    @Bean
    public Library l1(){
        return  new Library("Location 1", Arrays.asList(
                new Book ("Book3","Author3")
        ));
    }*/
}

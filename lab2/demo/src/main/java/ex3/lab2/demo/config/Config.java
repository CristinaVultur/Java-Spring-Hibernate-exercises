package ex3.lab2.demo.config;

import ex3.lab2.demo.aspects.MyAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {
    /**
     * Pt a lucra cu aspectul
     * 1. EnableAspectJAutoProxy
     * 2. Definirea clasei de aspect prin adnotarea de @ASpect
     * 3. Adaugrea aspectului in context (by default @Aspect nu adauga in context
     *
     */
    @Bean
    public MyAspect myAspect(){
        return new MyAspect();
    }
}

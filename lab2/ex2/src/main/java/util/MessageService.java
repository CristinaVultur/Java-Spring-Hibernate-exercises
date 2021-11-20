package util;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
@Lazy
public class MessageService {
    public void printMessage(){
        System.out.println("Hi AGAIN!");
    }

    @PostConstruct //primul lucru ce se apeleaza inainte oricui
    //citit parametrii din ..
    public void init(){
        System.out.println("instantianting messge service");
    }

    @PreDestroy //opus de post construct
    public void closing(){
        System.out.println("Bean has finished its job!");
    }
}

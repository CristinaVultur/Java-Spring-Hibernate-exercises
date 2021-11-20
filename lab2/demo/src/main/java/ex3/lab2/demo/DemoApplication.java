package ex3.lab2.demo;

import ex3.lab2.demo.aspects.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    public MainService mainService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(mainService.getLowerCaseName("Test 123"));
        System.out.println(mainService.getUpperCaseName("Test 456"));
    }
}

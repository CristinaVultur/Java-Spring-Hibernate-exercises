import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.MainRepository;
import service.MainService;


public class Main {
        public static void main(String[] args) {
            AnnotationConfigApplicationContext context = //zona in memorie ce contine componentele
                    new AnnotationConfigApplicationContext(ProjectConfig.class);


            MainService mainService = context.getBean(MainService.class);
            System.out.println(mainService.sayHello());
        }
}


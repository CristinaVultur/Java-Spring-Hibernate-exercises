import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.MessageService;

public class Main {
    public static void main(String[] args) {

        /**
         * eager => default bean instantiation
         * lazy => instantiaza beanul prima oara cand apelez ceva ce il foloseste (instantiation on the first call over bean)
         */
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("cContext was greated");
        MessageService messageService = context.getBean(MessageService.class);
        messageService.printMessage();
    }
}

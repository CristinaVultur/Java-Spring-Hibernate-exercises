import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import utils.MessageService;

public class Main {
    public static void main(String[] args) {
        /**
         * singleton => default scope (unul per context de spring)

         * prototype => new bean for any new call;
         * -folosit la configuratii de servicii
         * -ex: un service ce merge pe 4 servere diferite
         * -unde starea este mutabila
         * -daca inserezi un prototype intr un singleton , singletonul il obliga sa se creeze o singura data
         * ========================
         * in proiectele web:
         * request => new bean per request
         * session => new bean per session
         * application => new bean per application
         */
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Context was created");
        MessageService messageService1 = context.getBean(MessageService.class);
        messageService1.setMessage("Hello on second lab.");

        System.out.println("MSG1: "+ messageService1.getMessage());
        System.out.println(messageService1.hashCode());
        MessageService messageService2 = context.getBean(MessageService.class);
        System.out.println("MSG2: "+ messageService2.getMessage());
        System.out.println(messageService2.hashCode());
    }
}

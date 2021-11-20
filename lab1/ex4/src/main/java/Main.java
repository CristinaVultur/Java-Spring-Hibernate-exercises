import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    AnnotationConfigApplicationContext context = //zona in memorie ce contine componentele
            new AnnotationConfigApplicationContext(ProjectConfig.class);
}

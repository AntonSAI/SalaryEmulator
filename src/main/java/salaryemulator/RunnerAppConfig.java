package salaryemulator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import salaryemulator.annotation_config.AppConfiguration;

public class RunnerAppConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
    }
}

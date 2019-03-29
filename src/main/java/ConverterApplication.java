import configs.Config;
import controllers.ConverterController;
import helpers.SimpleCsvConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConverterApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SimpleCsvConverter csvConverter = context.getBean(SimpleCsvConverter.class);
        ConverterController converterController = context.getBean(ConverterController.class);
        converterController.run(args, csvConverter);

    }
}

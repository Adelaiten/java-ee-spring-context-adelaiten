package configs;

import controllers.ConverterController;
import helpers.FileReader;
import helpers.SimpleCsvConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Bean(name = "csvConverter")
    @Scope("prototype")
    public SimpleCsvConverter getCsvConverter() {
        return new SimpleCsvConverter(getFileReader());
    }

    @Bean
    @Scope("prototype")
    public FileReader getFileReader() {
        return new FileReader();
    }

    @Bean
    @Scope("prototype")
    public ConverterController getController() {return new ConverterController();
    }
}

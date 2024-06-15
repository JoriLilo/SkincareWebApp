package SkincareWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@SpringBootApplication

public class SkincareAppAplication {
    @Bean
   public SpringResourceTemplateResolver templateResolver() {
                SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
                resolver.setPrefix("classpath:/templates/");
                resolver.setSuffix(".html");
              resolver.setTemplateMode(TemplateMode.HTML);
              return resolver;
            }

            public static void main(String[] args) {
                SpringApplication.run(SkincareAppAplication.class, args);
            }
}

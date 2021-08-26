package se331.lab.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Lab07Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab07Application.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer(){
        return  new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/events")
                        .allowedOrigins("http://localhost:3000");
                registry.addMapping("/events/*")
                        .allowedOrigins("http://localhost:3000");
            }
        };
    }
}


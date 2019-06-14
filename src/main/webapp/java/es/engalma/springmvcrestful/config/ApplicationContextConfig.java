package es.engalma.springmvcrestful.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.lang.*;

@Configuration

@ComponentScan("es.engalma.springmvcrestful.*")
public class ApplicationContextConfig {

        // No need ViewSolver
        public int i =0;
        // Other declarations if needed ...
}

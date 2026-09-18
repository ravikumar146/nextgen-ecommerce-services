package com.medicare.pharma;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "${app.openapi.title}",
                description = "${app.openapi.description}",
                version = "${app.openapi.version}"
        )
)
@SpringBootApplication
public class MedicareApplication {
    public static void main(String[] args) {
        SpringApplication.run(MedicareApplication.class, args);
    }
}
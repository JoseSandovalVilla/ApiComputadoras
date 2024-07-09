package com.Ejercicio.Ejercicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(info = @Info(title = "API Documentation", version = "1.0", description = "API for Demo Project"))
@SpringBootApplication
public class EjercicioApplication {

	public static void main(String[] args) {

		SpringApplication.run(EjercicioApplication.class, args);
	}

}

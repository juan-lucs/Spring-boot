package io.github.Spring_boot.Produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // Marca a classe principal da aplicação Spring Boot.
// Quando o programa inicia, o Spring começa a procurar componentes,
// configurações e classes anotadas para gerenciar.

public class ProdutosapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProdutosapiApplication.class, args);
	}

}

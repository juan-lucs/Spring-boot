package io.github.Spring_boot.Produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // Marca a classe principal da aplicação Spring Boot.
// Quando o programa inicia, o Spring começa a procurar componentes,
// configurações e classes anotadas para gerenciar.


@RestController // Informa ao Spring que esta classe possui endpoints REST.
// Métodos anotados com @GetMapping, @PostMapping etc.
// poderão ser acessados via HTTP.


public class ProdutosapiApplication {
	@GetMapping("/hello-world") // Quando alguém fizer uma requisição GET para /hello-world, execute este método.
	// GET http://localhost:8080/hello-world
	public String msg (){
	return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProdutosapiApplication.class, args);
	}

}

package io.github.Spring_boot.Produtosapi.Controller;

import io.github.Spring_boot.Produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Informa ao Spring que esta classe possui endpoints REST.
// Métodos anotados com @GetMapping, @PostMapping etc.
// poderão ser acessados via HTTP.
@RequestMapping("produtos") //isso significa que quando eua cessar localhost/8080/produtos, eu vou estar acessando este Controller
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody /* diznedo para spring que eu vou receber valores no body,do tipo json,a spring vai converter para o que eu preciso*/ Produto produto) {
        System.out.println("Salvando produto: " + produto);
        return produto; // isso da uma resposta ao Postman, para facilitar se funcionou ou não. retorna em json, assim como foi r3ecebdio
    }

}

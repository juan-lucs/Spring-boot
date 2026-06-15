package io.github.Spring_boot.Produtosapi.Controller;

import io.github.Spring_boot.Produtosapi.model.Produto;
import io.github.Spring_boot.Produtosapi.repository.produtoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController // Informa ao Spring que esta classe possui endpoints REST.
// Métodos anotados com @GetMapping, @PostMapping etc.
// poderão ser acessados via HTTP.
@RequestMapping("produtos") //isso significa que quando eua cessar localhost/8080/produtos, eu vou estar acessando este Controller
public class ProdutoController {
    private produtoRepository produtoRepository;

    public ProdutoController(produtoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody /* diznedo para spring que eu vou receber valores no body,do tipo json,a spring vai converter para o que eu preciso*/ Produto produto) {
        System.out.println("Salvando produto: " + produto);
        String id = UUID.randomUUID().toString();
        produto.setId(id); 

        produtoRepository.save(produto);
        return produto; // isso da uma resposta ao Postman, para facilitar se funcionou ou não. retorna em json, assim como foi r3ecebdio
    }

    @GetMapping("/{id}") // quando eu quero que ele receba uma variável na url eu coloco {}
    public Produto obterPorId(@PathVariable /* dizendo que esse String id ve m do Path*/String id){
     return produtoRepository.findById(id).orElseGet(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        produtoRepository.deleteById(id);
    }

    @GetMapping("/todos")
    public List<Produto> obterTodos(){
        return produtoRepository.findAll();
    }

    @PutMapping("{id}")
    public Produto atualziar(@PathVariable String id, @RequestBody Produto produto){
        produto.setId(id);
        return produtoRepository.save(produto); // save pode salvar a primeira vez e também pode atualizar, ele verifica quando o produto já tem .setId para ver se vai atualizar ou criar um novo
    }
}


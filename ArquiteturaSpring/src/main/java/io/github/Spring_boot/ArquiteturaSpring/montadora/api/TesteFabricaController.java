package io.github.Spring_boot.ArquiteturaSpring.montadora.api;

import io.github.Spring_boot.ArquiteturaSpring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/carros")
@RestController
public class TesteFabricaController {

    @Autowired // isso pede para que a Spring procure um Bean já registrao do tipo Motor, ela associa sozinha os dois.
    //@Qualifier //serve para especificar quando se tem mais de um Bean de um tipoo
    private Motor motorviaspring;

    @PostMapping
    public CarroStatus iniciarCarro(@RequestBody Chave chave) {

        var carro = new HondaHRV(motorviaspring);

    return carro.darIgnicao(chave);
    }
}

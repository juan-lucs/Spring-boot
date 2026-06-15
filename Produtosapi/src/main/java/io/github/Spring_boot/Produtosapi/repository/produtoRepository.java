package io.github.Spring_boot.Produtosapi.repository;

import io.github.Spring_boot.Produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface produtoRepository extends JpaRepository<Produto, String> { // você precisa passar o tipo da entidade E o tipo do ID, nesse caso é um produto com id int
//nao precisa de nada aqui, apenas ao extender o jparepository o spring boot ja entende

    public List<Produto> findByNome(String nome);
}


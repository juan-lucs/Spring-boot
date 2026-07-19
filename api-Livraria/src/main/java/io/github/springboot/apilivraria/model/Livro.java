package io.github.springboot.apilivraria.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name= "livro")
@Data
public class Livro {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "isbn", length = 20, nullable = false)
    private String isbn;
    @Column (name="titulo", length = 150, nullable = false)
    private String titulo;
    @Column(name="data_publicacao", nullable = false)
    private LocalDate dataPublicao;
    @Enumerated(EnumType.STRING)
    @Column(name = "genero", length = 30, nullable = false)
    private GeneroLivro genero;
    @Column(name= "preco", precision = 12, nullable = false)
    private Double preco;
    @ManyToOne  // Muitos livros podem estar relacionados a um único autor.
    @JoinColumn(name = "id_autor")
    // Define a chave estrangeira (FK) na tabela livro.
    private Autor autors;
}

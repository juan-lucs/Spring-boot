package io.github.springboot.apilivraria.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity //dizendo que eeu estou mapendo jpa uma entity
@Table(name = "autor", schema="public") // não é obrigatório, mas é interessante porque eu posso modificar a definição dessa entity
@Getter // EM TEMPO DE COMPILAÇÃO, O STRING VAI GERAR GETTRER AND SETTERS PARA OS VALORES
@Setter
public class Autor {
    @Id
    @Column(name = "id") // dizendo que é uma coluna da tabela, e eu também posso parametrizar
    @GeneratedValue(strategy = GenerationType.UUID) //vai ser gerado automaticamente
    private UUID id;
    @Column(name= "nome", length = 100, nullable = false)
    private String nome;
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate datanascimento;
    @Column(name= "nacionalidade", length = 50, nullable = false)
    private String nacionalidade;

    @OneToMany(mappedBy = "autor")
    // Um autor pode possuir vários livros.
    // mappedBy indica que o relacionamento é controlado pelo atributo "autor" da classe Livro.
    private List<Livro> livros;
}

package io.github.Spring_boot.ArquiteturaSpring.toDos;


import org.springframework.stereotype.Service;

@Service // esse cara eu quero que você instancie ele e registre dentro do container para eu utilizar na frente
public class TodoService {
    //@Autowired pode ser dispensado nesse caso, o Spring consegue identificar que o construtor usa a dependencia
    private TodoRepository repository; // injeção de dependência no repo

    public TodoService(TodoRepository todoRepository) {
        this.repository = todoRepository; // ISSO BASICAMENTE OBRIGA A QUEM FOR USAR O SERVICE, ENTREGAR O REPOSITORY A SER USADO.
    }


    public TodoEntity salvar(TodoEntity entity){
    return repository.save(entity);
    }
}

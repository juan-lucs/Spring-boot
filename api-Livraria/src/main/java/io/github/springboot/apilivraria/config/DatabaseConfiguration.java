package io.github.springboot.apilivraria.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.driver-class-name}")
    private String driver;
// TUDO ISSO A BAIXO É UMA IMPLEMENTAÇÃO SIMPLES DE UMA CONEXÃO, NÃO É RECOMENDADO PARA PRODUÇÃO REAL, APENAS COMENTANDO O BEAN, O SPRING JA IGNORA ISSO
//    @Bean
//    @NonNull
    private DataSource datasource(){
        DriverManagerDataSource ds = new DriverManagerDataSource(); //DriverManagerDataSource IPLEMENTA de DataSource, por isso eu posso retornar ele. polimorfismo no sangue!!!
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        ds.setDriverClassName(driver);
        return ds;
    };
    @Bean
    // O HIKARI É O PADRÃO DA CRIAÇÃO NO SPRINGBOOT, SE EU DEIXAR O BEAN COMENTADO ELE JÁ VAI FAZER TUDO ISSO
    public DataSource hikariDataSource() {
        // Objeto que armazena todas as configurações do pool.
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(driver);
        // Número máximo de conexões que podem existir ao mesmo tempo.
        config.setMaximumPoolSize(10);
        //
        config.setMinimumIdle(1);
        // Nome do pool (aparece em logs e ferramentas de monitoramento).
        config.setPoolName("livraria-db-pool");
        // Tempo máximo que uma conexão pode ficar viva (10 minutos). Depois desse tempo ela é descartada e substituída.
        config.setMaxLifetime(600000);
        // Tempo máximo de espera para conseguir uma conexão do pool.Se passar desse tempo, uma exceção será lançada.
        config.setConnectionTimeout(100000);
        // Consulta usada para verificar se a conexão ainda está funcionando. Muitos drivers nem precisam disso atualmente.
        config.setConnectionTestQuery("SELECT 1");
        return new HikariDataSource(config);
    }
    // Diferente do DriverManagerDataSource, o HikariCP não cria uma conexão
// toda vez que o banco é acessado. Ele mantém um conjunto de conexões
// prontas e as empresta para a aplicação quando necessário.
}

package io.github.springboot.apilivraria.config;

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
// TUDO ISSO A BAIXO É UMA IMPLEMENTAÇÃO SIMPLES DE UMA CONEXÃO, NÃO É RECOMENDADO PARA PRODUÇÃO REAL
//    @Bean
//    @NonNull
//    private DataSource datasource(){
//        DriverManagerDataSource ds = new DriverManagerDataSource(); //DriverManagerDataSource IPLEMENTA de DataSource, por isso eu posso retornar ele. polimorfismo no sangue!!!
//        ds.setUrl(url);
//        ds.setUsername(username);
//        ds.setPassword(password);
//        ds.setDriverClassName(driver);
//        return ds;
//    };


}

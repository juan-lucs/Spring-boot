package io.github.Spring_boot.ArquiteturaSpring.montadora.configuration;

import io.github.Spring_boot.ArquiteturaSpring.montadora.Motor;
import io.github.Spring_boot.ArquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration // agora o Spring vai escanear essa classe  e podemos definir os beans
public class MontadoraConfiguration {

    @Bean // Posso utilizar injeção de dependência, registrar no container, injetar dentro do carro
    // Bean é quando você cria um método que retorna um ONBJETO construido
    @Primary // se eu nao especificar com o Qualifier, o spring vai chamar o Bean que tem o Primary
    public Motor motoraAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setModelo("XPTO-0");
        motor.setCilindros(4);
        motor.setLitragem(3.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }
    @Bean
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(100);
        motor.setModelo("TH-40");
        motor.setCilindros(2);
        motor.setLitragem(2.2);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }
    @Bean
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(720);
        motor.setModelo("XPTO-01");
        motor.setCilindros(4);
        motor.setLitragem(3.0);
        motor.setTipo(TipoMotor.TURBO
        );
        return motor;
    }
}

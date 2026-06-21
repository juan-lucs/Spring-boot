package io.github.Spring_boot.ArquiteturaSpring.montadora.configuration;

import io.github.Spring_boot.ArquiteturaSpring.montadora.Motor;
import io.github.Spring_boot.ArquiteturaSpring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // agora o Spring vai escanear essa classe  e podemos definir os beans
public class MontadoraConfiguration {

    @Bean // Posso utilizar injeção de dependência, registrar no container, injetar dentro do carro
    // Bean é quando você cria um método que retorna um ONBJETO construido
    public Motor motor() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setModelo("XPTO-0");
        motor.setCilindros(4);
        motor.setLitragem(3.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

}

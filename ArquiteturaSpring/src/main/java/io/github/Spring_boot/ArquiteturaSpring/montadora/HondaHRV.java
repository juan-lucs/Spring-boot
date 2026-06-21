package io.github.Spring_boot.ArquiteturaSpring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("Honda");
        setCor(Color.BLUE);
        setMontadora(Montadora.HONDA);
    }

}

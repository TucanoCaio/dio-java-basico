package interfaces.equipamentos;

import interfaces.plataforma.Digitalizadora;

public class Scanner implements Digitalizadora {

    public void digitalizar() {
        System.out.println("Digitalizando Scanner");
    }

}

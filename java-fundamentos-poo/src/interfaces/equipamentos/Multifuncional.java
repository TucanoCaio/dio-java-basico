package interfaces.equipamentos;

import interfaces.plataforma.Copiadora;
import interfaces.plataforma.Digitalizadora;
import interfaces.plataforma.Impressora;

public class Multifuncional implements Copiadora , Digitalizadora , Impressora{

    public void imprimir() {
        System.out.println("Imprimindo Multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando Multifuncional");
    }

    public void copiar() {
        System.out.println("Copiando Multifuncional");
    }
    
}

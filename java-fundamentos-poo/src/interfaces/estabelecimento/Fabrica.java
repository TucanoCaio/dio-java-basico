package interfaces.estabelecimento;

import interfaces.equipamentos.Multifuncional;
import interfaces.plataforma.Copiadora;
import interfaces.plataforma.Digitalizadora;
import interfaces.plataforma.Impressora;

public class Fabrica {
   public static void main(String[] args) {
    
    Multifuncional eM = new Multifuncional();

    Copiadora copiadora = eM;
    Digitalizadora digitalizadora = eM;
    Impressora impressora = eM;

    copiadora.copiar();
    digitalizadora.digitalizar();
    impressora.imprimir();


   } 
}

public class SistemaMedida {

    //switch e case

    public static void main(String[] args) {
        
        String sigla = "A";

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
        
            default:{
                System.out.println("Indefinido");
                break;
            }
        }

        /*if (sigla == "P") {
            System.out.println("Pequeno");
           
        }else if (sigla == "M") {
            System.out.println("Pequeno");

        }else if (sigla == "G") {
            System.out.println("Pequeno");

        }else {
            System.out.println("Indefinido");
        }*/
    }
    
}

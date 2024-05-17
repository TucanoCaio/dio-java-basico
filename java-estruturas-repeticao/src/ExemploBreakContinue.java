public class ExemploBreakContinue {
    
    public static void main(String[] args) {
        
        System.out.println("Teste break");
        for( int numero = 1; numero <= 5 ; numero ++){

            if (numero == 3) {
                break;
            }

            System.out.println(numero);

        }

        System.out.println("Teste Continue");
        for( int numero2 = 1; numero2 <=5; numero2 ++){

            if (numero2 == 3) {
                continue;
            }

            System.out.println("Numero: " + numero2);
        }
    }
}

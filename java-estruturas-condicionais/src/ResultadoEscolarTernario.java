public class ResultadoEscolarTernario {

    //Condicional Ternaria

    public static void main(String[] args) throws Exception {
        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "de Recuperação" : "Reprovado";
        System.out.println("O aluno esta " + resultado);
    
        /*if (nota >= 7) {
    
            System.out.println("Aluno aprovado");
    
        }else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno esta de recuperação");
        }else {
            System.out.println("Aluno reprovado");
        }*/        
    }
    
}
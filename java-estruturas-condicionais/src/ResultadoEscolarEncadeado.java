public class ResultadoEscolarEncadeado {

    //Condicional Encadeada

    public static void main(String[] args) throws Exception {
        int nota = 8;
    
        if (nota >= 7) {
    
            System.out.println("Aluno aprovado");
    
        }else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno esta de recuperação");
        }else {
            System.out.println("Aluno reprovado");
        }        
    }
    
}


public class CaixaEletronico {

    //Condicional Simples

    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado <= saldo) {

            saldo = saldo - valorSolicitado;

            System.out.println("Valor saque " + String.format("R$ %.2f", valorSolicitado) + ", saldo disponivel " + String.format("R$ %.2f", saldo));

        }System.out.println("Valor solicitado não disponivel, saldo atual, " + String.format("R$ %.2f", saldo));
        
    }
}

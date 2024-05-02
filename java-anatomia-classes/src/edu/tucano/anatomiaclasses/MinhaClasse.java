package edu.tucano.anatomiaclasses;
public class MinhaClasse {
    
public static void main(String[] args) {
    String meuNome = "Caio";

    int anoFabricação = 2022;

    String primeiroNome = "Caio";
    String segundoNome = "Tucano";
    
    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

    System.out.println(nomeCompleto);


}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do Método " + primeiroNome.concat(" ").concat(segundoNome);
}
    
}

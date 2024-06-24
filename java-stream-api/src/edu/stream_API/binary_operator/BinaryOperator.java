package edu.stream_API.binary_operator;

import java.util.Arrays;
import java.util.List;

public class BinaryOperator {
    public static void main(String[] args) {
        
        List<Integer> listaNumero = Arrays.asList(1,2,3,4,5);

        int resultado = listaNumero.stream().reduce(0, (n1, n2) -> n1+ n2);

        System.err.println(resultado);
    }
    
}

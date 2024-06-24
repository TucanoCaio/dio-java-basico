package edu.stream_API.consumer;

import java.util.Arrays;
import java.util.List;
//Para utilizar o Consumar de forma explicita (fora do forEach) deve-se importar
//import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) throws Exception {
       List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Utilizando Consumer de forma externa atravez de um metodo
        /*Consumer<Integer> imprimirNumerosPares = n -> {
            if (n % 2 == 0){
                System.out.println(n);
            }
        };

        numeros.forEach(imprimirNumerosPares);*/


       //Uma forma mais simplificada é utilizar o consumer direto pelo forEach
        numeros.forEach(n -> {
            if(n % 2 == 0){
                System.out.println(n);
            }
        }
        );
    }
}

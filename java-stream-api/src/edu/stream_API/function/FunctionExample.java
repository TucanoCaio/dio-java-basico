package edu.stream_API.function;

import java.util.Arrays;
import java.util.List;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> numerosDobrados = numeros.stream()
            .map(n -> n*2)
            .toList();

        numerosDobrados.forEach(n -> System.out.println(n));
    }
    
}

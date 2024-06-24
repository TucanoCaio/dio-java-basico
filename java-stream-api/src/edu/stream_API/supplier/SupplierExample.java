package edu.stream_API.supplier;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        
        List<String> listaSaudacao = Stream.generate(() -> "Olá, tudo bem?")
        .limit(3)
        .toList();

        listaSaudacao.forEach(l -> System.out.println(l));
    }
}

package edu.stream_API.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "C", "Go", "Ruby", "JavaScript");

        palavras.stream()
            .filter(p -> p.length()>5)
            .forEach(System.out::println);
    }
}
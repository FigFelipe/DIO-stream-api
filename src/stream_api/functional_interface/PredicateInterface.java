package stream_api.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {

    /**
    Predicate<T>:
     Representa uma função que aceita um argumento do tipo T e
     retorna um valor booleano (verdadeiro ou falso).
     É comumente usada para filtrar os elementos do Stream com base em alguma condição.
     */

    public static void main(String[] args) {

        // Criando uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usando o Stream para filtra palavras com mais de 5 caracteres, e
        // imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter(maisDeCincoCaracteres) // Predicado como parametro
                .forEach(System.out::println);
    }
}

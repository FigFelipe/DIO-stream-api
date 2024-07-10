package stream_api.functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierInterface {

    /**
    Supplier<T>:
     Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
     É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
     */

    public static void main(String[] args) {

        // Supplier com expressao lambda para fornecer uma saudacao personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";

        // Usando o supplier para obter uma lista de saudacoes
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(3)
                .toList();

        // Imprimir as saudacoes geradas
        listaSaudacoes.forEach(System.out::println);
    }
}

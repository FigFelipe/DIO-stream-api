package stream_api.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionInterface {

    /**
    Function<T, R>:
     Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
     É utilizada para transformar ou mapear os elementos do Stream em outros valores ou tipos.
     */

    public static void main(String[] args) {

        // Lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Utilizando a Function com expressao lambda para dobrar os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Função para dobrar os numeros no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        // Imprimir a lista de numeros dobrados
        numerosDobrados.forEach(System.out::println);

    }
}

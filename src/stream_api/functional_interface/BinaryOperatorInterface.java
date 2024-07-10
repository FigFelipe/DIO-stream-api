package stream_api.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterface {

    /**
    BinaryOperator<T>:
     Representa uma operação que combina dois argumentos do tipo T e
     retorna um resultado do mesmo tipo T.
     É usada para realizar operações de redução em pares de elementos,
     como somar números ou combinar objetos.
     */

    public static void main(String[] args) {

        // Criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usando o BinaryOperator com expressao lambda para somar dois numeros inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // Usando o BinaryOperator para somar todos os numeros do Stream
        int resultado = numeros.stream()
                .reduce(0, somar);

        // Imprimir o resultado da soma
        System.out.println("Soma dos numeros é: " + resultado);
    }
}

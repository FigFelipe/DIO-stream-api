package stream_api.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

    /**
    Consumer<T>:
     Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
     É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos
     do Stream sem modificar ou retornar um valor.
     */

    public static void main(String[] args) {

        // Criando uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressao lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        // O stream utiliza o consumer 'imrpimirNumeroPar'
        numeros.stream().forEach(imprimirNumeroPar);

        // Ou instanciar o consumer
        // que cria automaticamente um metodo 'accept'
        numeros.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {

                if(num % 2 == 0){
                    System.out.println(num);
                }
            }
        });

        // Utilizando o metodo recomendado (com o lambda)
        numeros.forEach(num -> {
            if(num % 2 == 0){
                System.out.println(num);
            }
        });
    }

}

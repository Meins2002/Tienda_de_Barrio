package Actividades;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;

import static Actividades.Numreros_primos.esPrimo;


public class Actividad_clase {
    //Crear cola y llenar de numeros aleatoreos
    public static void main (String[] args){
        Queue<Integer> cola = new LinkedList<>();

        //Agregar datos
        Random min_random = new Random();
        for (int i = 0 ; i < 10 ; i++ ){
            int numeros = min_random.nextInt(100) + 1;
            cola.add(numeros);
        }
        System.out.println("Lista: " + cola);

        System.out.println("Numero primos:");

        while (!cola.isEmpty()){
            int numero = cola.poll();
            if (esPrimo(numero)){
                System.out.println(numero);
            }


        }

    }
}

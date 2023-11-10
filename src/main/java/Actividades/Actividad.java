package Actividades;

import java.util.ArrayList;



public class Actividad {
    public static void main (String[] args){

       ArrayList <Integer> numeros = new ArrayList<>();

       numeros.add(2);
        numeros.add(23);
        numeros.add(232);
        numeros.add(5462);
        numeros.add(232);
        numeros.add(5263);

        System.out.println("Numeros pares:");

        for (  int numero :  numeros ){
            if (numero % 2 == 0) {
                System.out.println(numero );
            }

        }
    }

}

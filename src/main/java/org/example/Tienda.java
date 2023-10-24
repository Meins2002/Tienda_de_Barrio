package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;


class Tienda {
    public static void main(String[] args)
            throws IOException {

     //Nombre de la Tienda de Barrio "Tienda de barrio"
        System.out.println("El Rolo");

        System.out.println("***********************");
        System.out.println("*  Tienda de barrio:  *");
        System.out.println("***********************");

        Scanner teclado = new Scanner(System.in);

        //Variables:
        String Product_Name;
        String Product_Description;
        String Product_category;
        String Product_Label;

        double Product_Price;


        System.out.print("Ingresa Nombre del Producto: ");
        Product_Name = teclado.nextLine();

        System.out.print("Cantidad del Producto: " );
        Product_Description = teclado.nextLine();

        System.out.print("Categoria del Producto :");
        Product_category = teclado.nextLine();

        System.out.print("Etiqueta del Producto: ");
        Product_Label = teclado.nextLine();


        System.out.print("Precio: ");
        Product_Price = teclado.nextDouble();
        teclado.close();

        System.out.print("Se ha registrado el Producto: " + Product_Name + " " + Product_Description + " " + Product_category + " " + Product_Label + " " + Product_Price);
    }

}
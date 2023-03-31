package com.ayudantias;

import java.util.Scanner;
import java.util.Random;

public class Main {
    /**
     * Este metodo corresponde al metodo main, quien se encarga de ejecutar el programa prncipal
     *
     * @param args OLa
     * @return
     **/

    public static void main(String[] args) {

	    System.out.println("Ingrese un numero: ");
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);

        // && and / || or / ! distinto / != no igual
        if(9>1) {
            System.out.println(":)");
        }

        int [] arr = new int[10]; // arreglo

        for(int i = 0 ; i < 10 ; i++)
        {
            arr[i] = i+1;
        }

        for(int i = 0 ; i < 10 ; i++)
        {
            System.out.println(arr[i]);
        }

        int contador = 0;

        while(contador != 6)
        {
            System.out.println("Esta es la ejecucion numero " + (contador + 1));
            contador++;
        }

        // System.out.println(Math.random());
    }
}

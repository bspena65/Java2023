package aplicaciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bpenc
 */
import java.util.Scanner;

public class NumerosEnteros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero inicial: ");
        int i = leer.nextInt();

        System.out.print("Ingrese el numero final: ");
        int f = leer.nextInt();

        int c = 0, j = i + 1;
        while (j < f) {
            c++;
            j++;
        }
        System.out.println("cantidad: " + c);
        
        //for
        System.out.print("Ingrese un numero inicial: ");
        int inicial = leer.nextInt();

        System.out.print("Ingrese el numero final: ");
        int fin = leer.nextInt();

        int contador = 0;
        for (int a = inicial+1; a<fin; a++){
            contador++;
        }
        System.out.println("cantidad: " + contador);

    }
}

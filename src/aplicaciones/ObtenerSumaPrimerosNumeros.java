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

public class ObtenerSumaPrimerosNumeros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //While
        System.out.print("Ingresar un numero: ");
        int n = leer.nextInt();

        int i = 0, suma = 0;
        while (i <= n) {
            suma = suma + i;
            i++;
        }
        System.out.println("El resultado es: " + suma);
        
        
        //For
        System.out.print("Ingresar un numero: ");
        int n1 = leer.nextInt();

        int suma1 = 0;
        for (int j = 0; j <= n1; j++) {
            suma1 = suma1 + j;
        }

        System.out.println("El resultado es: " + suma1);

    }
    
}

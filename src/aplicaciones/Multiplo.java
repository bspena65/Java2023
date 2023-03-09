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

public class Multiplo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();

        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println("Si el multiplo de 3 y 5");
        } else {
            System.out.println("No es multiplo de 3 y 5");
        }
    }
}

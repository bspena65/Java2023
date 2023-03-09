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

public class Sumar {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: "); var n1 =leer.nextInt();
        System.out.print("Ingrese el egundo numero: "); var n2 =leer.nextInt();
        
        var total = n1 + n2;
        
        System.out.printf("La suma %d + %d = %d \n",n1,n2,total);
        System.out.println("La suma de los dos numero es: " + total);
    }
    
}

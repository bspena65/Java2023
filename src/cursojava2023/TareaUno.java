package cursojava2023;

/**
 *
 * @author bpenc
 */

import java.util.Scanner;
public class TareaUno {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese valor 1: ");
        int Num1 = leer.nextInt();

        System.out.print("Ingrese valor 2: ");
        int Num2 = leer.nextInt();   
        
        var suma = Num1 + Num2;
        var resta = Num1 - Num2;
        
        System.out.printf("La suma de %d + %d = %d \n", Num1, Num2, suma);
        System.out.printf("La resta de %d - %d = %d \n", Num1, Num2, resta);
        
    }
}

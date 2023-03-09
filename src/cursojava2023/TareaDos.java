package cursojava2023;


/**
 *
 * @author bpenc
 */

import java.util.Scanner;
public class TareaDos {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero entero: ");
        int n1 = leer.nextInt();
        
        
        System.out.print("Ingrese el segundo numero entero: ");
        int n2 = leer.nextInt();
        
        int cociente = n1 / n2;
        int residuo = n1 % n2;
        
        System.out.printf("El cociente entre %d / %d  = %d \n", n1, n2, cociente);
        System.out.printf("El residuo entre %d Mod %d  = %d \n", n1, n2, residuo);

    }
    
}

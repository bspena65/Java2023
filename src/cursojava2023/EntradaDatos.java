package cursojava2023;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bpenc
 */
import java.util.Scanner;

public class EntradaDatos {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");       
        String nombre = leer.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Bienvenido " + nombre + " Tu edad es: " + edad);
    }
    
}

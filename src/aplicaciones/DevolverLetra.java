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

public class DevolverLetra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresar numero: ");
        int n = leer.nextInt();
        String Resultado = null;

        switch (n) {
            case 0:
                Resultado = "Cero";
                break;
            case 1:
                Resultado = "Uno";
                break;
            case 2:
                Resultado = "Dos";
                break;
            case 3:
                Resultado = "Tres";
                break;
            case 4:
                Resultado = "Cuatro";
                break;
            case 5:
                Resultado = "Cinco";
                break;
            case 6:
                Resultado = "Seis";
                break;
            case 7:
                Resultado = "Siete";
                break;
            case 8:
                Resultado = "Ocho";
                break;
            case 9:
                Resultado = "Nueve";
                break;

            default:
                System.out.println("El numero ingresado es incorrecto...");

        }
        
        System.out.println("El numero es: " + Resultado);
    }

}

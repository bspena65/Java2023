package cursojava2023;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables
        int num;
        String resultado;

        // Crear objeto de la clase Scanner
        Scanner leer = new Scanner(System.in);

        // Ingresar Datos
        System.out.print("Número: ");
        num = leer.nextInt();

        // Solución
        if (num % 3 == 0 && num % 5 == 0) {
            resultado = " ES MÚLTIPLO DE 3 Y 5.";
        } else {
            resultado = " NO ES MÚLTIPLO DE 3 Y 5.";
        }

        // Mostrar Datos
        System.out.println();
        System.out.println("El número " + num + resultado);
    }
}

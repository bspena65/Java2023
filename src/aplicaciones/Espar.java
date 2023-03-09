package aplicaciones;


/**
 *
 * @author bpenc
 */
import java.util.Scanner;

public class Espar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();

        if (n != 0) {
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println("Es par positivo");
                } else {
                    System.out.println("Es impar positivo");
                }
            } else {
                if (n % 2 == 0) {
                    System.out.println("Es par negativo");
                } else {
                    System.out.println("Es impar negativo");
                }
            }

        } else {
            System.out.printf("El valor %d es neutro",n);
        }

    }

}

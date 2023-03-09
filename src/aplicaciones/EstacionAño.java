package aplicaciones;


/**
 *
 * @author bpenc
 */
import java.util.Scanner;
public class EstacionAño {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("1 --> Verano \n"
                + "2 --> Otoño \n"
                + "3 --> Invierno \n"
                + "3 --> Primavera \n");
        System.out.print("Ingrese un numero de estacion del año: ");
        int n = leer.nextInt();

        String e = null;

        switch (n) {
            case 1:
                e = "Verano";
                break;
            case 2:
                e = "Otoño";
                break;
            case 3:
                e = "Invierno";
                break;
            case 4:
                e = "Primavera";
                break;
            default:
                System.out.println("El numero ingresado es incorrecto");
        }
        System.out.println("La estacion es: " + e);
    }
}

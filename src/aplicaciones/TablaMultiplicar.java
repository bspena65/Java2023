package aplicaciones;


/**
 *
 * @author bpenc
 */
import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = leer.nextInt();

        int a = 0;
        while (a <= 10) {
            System.out.printf(" %d x %d = %d  \n", n, a, (n * a));
            a++;
        }
        
        System.out.println("\n\n");

        //do while
        int i = 0;
        do {
            System.out.printf(" %d x %d = %d  \n", n, i, (n * i));
            i++;
        }while(i<=10);
       
        
    }

}

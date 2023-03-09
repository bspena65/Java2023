package aplicaciones;


/**
 *
 * @author bpenc
 */
import java.util.Scanner;

public class DevolverOperaciónDosNumeros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int n1, n2, resultado = 0;

        System.out.print("Ingrese el primer numero: ");
        n1 = leer.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        n2 = leer.nextInt();

        System.out.println("\n");
        System.out.println("""
                           || OPERADORES ||
                           + 
                           - 
                           * 
                           / 
                           """);

        char operador;
        System.out.print("selecione el tipo de operacion a ejecutar: ");
        operador = leer.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 == 0) {
                    resultado = 0;
                } else {
                    resultado = n1 / n2;
                }
                break;
            default:
                System.out.println("Operador ingresado incorrecto");
        }

        
        System.out.println("El resultado es: " + resultado);

    }
}

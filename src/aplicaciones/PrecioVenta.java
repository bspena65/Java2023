package aplicaciones;


/**
 *
 * @author bpenc
 */
import java.util.Scanner;

public class PrecioVenta {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese valor de venta: ");
        double valor = leer.nextDouble();
        //IGV 18%
        double igv = valor *0.18;
        var precioVenta = valor + igv;
        
        System.out.println("Valor de venta: " + valor);
        System.out.println("IGV: " + igv);
        System.out.println("Precio de venta: " + precioVenta);
        
    }

}

package cursojava2023;


/**
 *
 * @author bpenc
 */
public class Variables {
    
       
    public static void main(String [] args){
    
        System.out.println("Hola Mundo");
        
        //Variables
        String nombre;
        int a, b, c;
        nombre = "Juan";
        int num = 25;
        a = 1;
        b = 2;
        c = 3;
        
        double aux;
        aux = 2.5;
        
        System.out.println(nombre);
        System.out.println(num);
        
        num += 30;
        System.out.println(num);
        
        System.out.println(a + b + c);
        
     //Nueva forma de definir variables
     
        var apellido = "Pedro";
        var num1 = 25;
        var union = apellido + num1;
     
        System.out.println("Mi apellido y edad es:" + union);
        
        System.out.println(aux);
    }    
}

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

public class EsVocal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char c = leer.next().charAt(0);

        if (c == 'a' || c == 'A') {
            System.out.printf("La letra %s es una voval", c);
        } else if (c == 'e' || c == 'E') {
            System.out.printf("La letra %s es una voval", c);
        } else if (c == 'i' || c == 'I') {
            System.out.printf("La letra %s es una voval", c);
        } else if (c == 'o' || c == 'O') {
            System.out.printf("La letra %s es una voval", c);
        } else if (c == 'u' || c == 'U') {
            System.out.printf("La letra %s es una voval", c);
        } else {
            System.out.printf("La letra %s no es una voval \n", c);
        }
    }

}

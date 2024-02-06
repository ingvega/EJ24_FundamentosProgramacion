/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class ErrorScanner {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String nombre; 
        /*
18
Juan Perez

        */
//        int edad;
//        System.out.println("Ingresa tu edad");
//        edad = lector.nextInt();
//        lector.nextLine(); //Leer el enter que quedó extra
//        System.out.println("Ingresa tu nombre");
//        nombre=lector.nextLine();
//System.out.printf("Hola %s, tienes %d años",nombre,edad);
/*
1000,5
Juan Perez
*/
        double sueldo;
        System.out.println("Ingresa tu sueldo");
        sueldo = lector.nextDouble();
        System.out.println("Ingresa tu nombre");
        nombre=lector.nextLine();
        
        System.out.printf("Hola %s, tu sueldo es %f",nombre,sueldo);
    }
}

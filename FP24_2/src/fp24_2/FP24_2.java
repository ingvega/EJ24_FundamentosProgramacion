/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fp24_2;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class FP24_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int unidades = sc.nextInt();
        int precio = sc.nextInt();
        int total = precio * unidades;
        
        if(unidades>=6){
            //total -= total*.05;
            //42-2.1=39.9  total con descuento->39
            //54-2.7=51.3  total con descuento->51
            total = (int)(total - total*.05);
            
            //42-2  total con descuento->40
            //54-2   total con descuento->52
            total = total - (int)(total*.05); //Dueño beneficiado
        }
        
        System.out.printf("%d\n", total);
        
        sc.close();
    }
    
}

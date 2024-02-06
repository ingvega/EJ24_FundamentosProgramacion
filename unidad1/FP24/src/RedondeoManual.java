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
public class RedondeoManual {
    public static void main(String[] args) {
        int c1,c2,c3,c4,c5;
        Scanner lector=new Scanner(System.in);
        c1=lector.nextInt();
        c2=lector.nextInt();
        c3=lector.nextInt();
        c4=lector.nextInt();
        c5=lector.nextInt();
        double promedio=(c1+c2+c3+c4+c5)/5.0;
        int entero=(int)promedio;
        double decimal=promedio-entero;
        if(decimal>=0.5){
            entero++;
        }
        System.out.println(entero);
        //100 97 89 100 85
    }
    
            
}

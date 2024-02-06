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
public class Promedio {
    public static void main(String[] args){
        double c1,c2,c3,c4,c5;
        Scanner lector=new Scanner(System.in);
        c1=lector.nextInt();
        c2=lector.nextInt();
        c3=lector.nextInt();
        c4=lector.nextInt();
        c5=lector.nextInt();
        double promedio=(c1+c2+c3+c4+c5)/5;
        System.out.println(promedio);
        //100 97 89 100 85
        double promOptimista=Math.ceil(promedio);
        double promPesimista=Math.floor(promedio);
        long prom=Math.round(promedio);
        
        System.out.printf("%.0f %.0f %d",promOptimista,
                promPesimista,prom);
    }
}

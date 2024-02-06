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
public class Promedio2 {
    public static void main(String[] args){
        int c1,c2,c3,c4,c5;
        Scanner lector=new Scanner(System.in);
        c1=lector.nextInt();
        c2=lector.nextInt();
        c3=lector.nextInt();
        c4=lector.nextInt();
        c5=lector.nextInt();
        double promedio=(c1+c2+c3+c4+c5)/5.0;
        System.out.println(promedio);
        //100 97 89 100 85
        int promOptimista = (int) Math.ceil(promedio);
        int promPesimista= (int) Math.floor(promedio);
        int prom = (int) Math.round(promedio);
        System.out.println("PROMEDIO");
        System.out.println("El promedio es " + (c1+c2+c3+c4+c5)/5.0);
        System.out.println("Suma= " + (c1+c2+c3+c4+c5));
        //Incorrecta
        System.out.println("Suma= " + c1+c2+c3+c4+c5);
        System.out.println(promOptimista + promPesimista + prom);
        System.out.println(promOptimista + promPesimista + " " + prom);
    }
}

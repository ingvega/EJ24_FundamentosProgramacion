/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class TrianguloNumeros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n, cont=0, cont1;
        n=sc.nextInt();
        cont1=n;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=cont; j++)
             {
                  System.out.print("0");
                  
             }
             cont++;
            for(int j=1; j<=cont1; j++)
            {
                
                System.out.print(i);
            }
             cont1--;
             System.out.println();
             
        }
    }
}

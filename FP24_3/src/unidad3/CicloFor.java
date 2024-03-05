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
public class CicloFor {
    public static void main(String[] args) {
        
        //Realiza un programa que imprima los números impares desde 0 hasta N
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("----------------------------------");
        int j=0;
        for (;;) {
            if(j++>=n){
                break;
            }
            System.out.println(j);
        }
        
        System.out.println("---------------------------------");
        for (int i=1; i<=n; i++){
            if(i % 2 !=0){
                System.out.println(i+" ");
            }
           
        }
    }
}

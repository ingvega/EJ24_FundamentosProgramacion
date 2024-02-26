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
public class NewClass {
    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            System.out.println(i);
//        }
//        
//        for(int i=5;i>=1;i--){
//            System.out.println(i);
//        }
//        
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        lector.nextLine();
        String caracter=lector.nextLine();
        
        String linea="";
        for (int i = 0; i < 10; i++) {
            linea+=caracter;
            System.out.println(linea);
        }
        
        /*
        *
        **
        ***
        ****
        *****
        */
    }
}

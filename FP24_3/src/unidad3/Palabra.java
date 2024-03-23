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
public class Palabra {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        String palabra,palabraCorta;
        int n=lector.nextInt();
        lector.nextLine();
        palabraCorta=lector.nextLine();
        n--;
        for(int i=1;i<=n;i++){
            palabra=lector.nextLine();
            if(palabraCorta.length()>palabra.length()){
                palabraCorta=palabra;
            }
        }
        System.out.println(palabraCorta);
        System.out.println(palabraCorta.length());
        if(palabraCorta.length()%2==0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
        
    }
}

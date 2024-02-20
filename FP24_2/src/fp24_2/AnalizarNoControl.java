/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24_2;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class AnalizarNoControl {
    public static void main(String[] args) {
        String noControl="s21120001";
        char c1=noControl.charAt(1); //'2'
        char c2=noControl.charAt(2);//'1'
        
        int i1=c1-48;
        int i2=c2-48;
        
        int generacion=i1*10+i2;
        System.out.print("Generacion = ");
        if(generacion==98 || generacion==99){
            System.out.print("19");
        }else{
            System.out.print("20");
        }
        System.out.println(generacion);
        
        int z= Integer.parseInt("23");
        
    }
    
//    public static void main(String[] args) {
//        Scanner lector=new Scanner(System.in);
//        String noControl=lector.next();
//        //String noControl=lector.nextLine();
//        char carrera=noControl.charAt(0);
//        System.out.print("Carrera = ");
//        switch(carrera){
//            case 's':
//            case 'S':
//                System.out.println("Sistemas Computacionales");
//                break;
//            case 'd':
//            case 'D': 
//                System.out.println("Industrial");
//                break;
//                //G Gestion Empresarial A Ambiental E Electronica M Gastronomia T Sistemas Automotrices C Cambio de Carrera
//        }
//        
//    }
}

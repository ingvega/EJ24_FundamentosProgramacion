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

//    public static void main(String[] args) {
//        String noControl = "s21121000";
//        
//        boolean imprimir = false;
//        if (noControl.charAt(5) != '0') {
//            System.out.print(noControl.charAt(5));
//            imprimir = true;
//        }
//        
//        if (noControl.charAt(6) != '0'  || imprimir) {
//            System.out.print(noControl.charAt(6));
//            imprimir = true;
//        }
//
//        if (noControl.charAt(7) != '0' ||imprimir) {
//            System.out.print(noControl.charAt(7));
//        }
//
//        System.out.println(noControl.charAt(8));
//    }

    /*
    *Utiliza la clase wrapper(envoltorio) de int, que permite trabajar con los int 
    *al mismo nivel que se maneja el tipo String
    *Cada tipo de dato primitivo tiene una clase envoltorio, por ejemplo:
    *double->Double
    *boolean->Boolean
    *float->Float
    *int->Integer
    *char->Character
     */
    public static void main(String[] args) {
        String noControl="s21120001";
        int x;
        double y=20;
        
        x=(int)y;
        y=x;
        //x=x+y;
        x+=y;
        
        String strConsecutivo=""+noControl.charAt(5)+
                noControl.charAt(6)+
                noControl.charAt(7)+
                noControl.charAt(8);
        
        /*
        String strConsecutivo="";
        strConsecutivo+=noControl.charAt(5)+
                noControl.charAt(6)+
                noControl.charAt(7)+
                noControl.charAt(8);
        */
        
        int consecutivo=Integer.parseInt(strConsecutivo);
        //consecutivo=Integer.parseInt("A");
        
        System.out.println(consecutivo);
    }
/*
    Obtiene el consecutivo usando el mismo algoritmo que toma los caracteres
    y los convierte a su equivalente entero a través de la tabla ascii y lo genera
    mediante la obtención de las unidades de millar, centenas, decenas y unidades
     */
//    public static void main(String[] args) {
//        String noControl="s21120001";
//        
//        char c1=noControl.charAt(5); //'0'
//        char c2=noControl.charAt(6);//'0'
//        char c3=noControl.charAt(7);//'0'
//        char c4=noControl.charAt(8);//'1'
//        
//        int i1=c1-48;
//        int i2=c2-48;
//        int i3=c3-48;
//        int i4=c4-48;
//        
//        int consecutivo=((i1*1000)+(i2*100)+(i3*10)+i4);
//        
//        System.out.println(consecutivo);
//        
//        int z= Integer.parseInt("23");
//        
//    }
    /*Obtiene la generaón tomando los caracteres y los convierte a su equivalente 
    entero a través de la tabla ascii y lo genera mediante la obtención de las 
    unidades de millar, centenas, decenas y unidades */
//public static void main(String[] args) {
//        String noControl="s21120001";
//        char c1=noControl.charAt(1); //'2'
//        char c2=noControl.charAt(2);//'1'
//        
//        int i1=c1-48;
//        int i2=c2-48;
//        
//        int generacion=i1*10+i2;
//        System.out.print("Generacion = ");
//        if(generacion==98 || generacion==99){
//            System.out.print("19");
//        }else{
//            System.out.print("20");
//        }
//        System.out.println(generacion);
//        
//        int z= Integer.parseInt("23");
//        
//    }
    /*
    Obtiene la carrera
     */
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

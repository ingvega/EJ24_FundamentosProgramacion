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
public class CarreraCaballos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int t = lector.nextInt(),
                totalC1 = 0, totalC2 = 0,distanciaMayor=0;
        int estado=0; //0 significa empate, 1 significa caballo 1 va ganando, 2 significa caballo2 va ganando
        for (int i = 1; i <= t; i++) {
            totalC1+=lector.nextInt();
            totalC2+=lector.nextInt();
            //Obtengo la distancia entre los caballos
            int distancia=Math.abs(totalC1-totalC2);
            //Solo cuando la nueva distancia sea mas grande se reemplaza como distancia mayor
            if(distanciaMayor<distancia)
                distanciaMayor=distancia;
            
            if(totalC1==totalC2 && estado!=0){//No estaban empatados y se detecta empate
                    System.out.println("Al minuto " + i + " los caballos van empatados");
                    estado=0; //Ahora van empatados
            } else if (totalC1 > totalC2 && estado!=1) { //Detectamos que el caballo 1 va ganando y no iba ganando
                System.out.println("Al minuto " + i + " el caballo 1 toma la delantera");
                estado=1;//Ahora va ganando el 1
            } else if (totalC2 > totalC1 && estado!=2) { //Detectamos que el caballo 2 va ganando y no iba ganando
                System.out.println("Al minuto " + i + " el caballo 2 toma la delantera");
                estado=2;
            }
        }
        if (estado==0) {
            System.out.println("Termina la carrera y empatan los caballos");
        } else if (estado==1) {
            System.out.println("Termina la carrera y gana el caballo 1");
        } else {
            System.out.println("Termina la carrera y gana el caballo 2");
        }
        
        System.out.println("La distancia maxima entre los caballos fue de " + distanciaMayor);
    }
    /*public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int t = lector.nextInt(),
                avanceC1, avanceC2,
                totalC1 = 0, totalC2 = 0;
        boolean empate = true, caballo1 = false, caballo2 = false;
        for (int i = 1; i <= t; i++) {
            avanceC1 = lector.nextInt();
            avanceC2 = lector.nextInt();
            totalC1 += avanceC1;
            //totalC1+=lector.nextInt();
            totalC2 += avanceC2;
            //if(totalC1==totalC2 && !empate){
            if (totalC1 == totalC2) { //Detectamos empate
                if (empate == false) { //Verificar si antes no había empate para narrar el empate
                    System.out.println("Al minuto " + i + " los caballos van empatados");
                    empate = true;
                    caballo1 = false;
                    caballo2 = false;
                    //empate=!(caballo1=caballo2=false);
                }
            } else if (totalC1 > totalC2) { //Detectamos que el caballo 1 va ganando
                if (caballo1 == false) { //Verificar si antes no iba ganando el caballo 1
                    System.out.println("Al minuto " + i + " el caballo 1 toma la delantera");
                    caballo1 = !(empate = caballo2 = false);
                }
            } else {  //Detectamos que el caballo 2 va ganando
                if (caballo2 == false) { //Verificar si antes no iba ganando el caballo 2
                    System.out.println("Al minuto " + i + " el caballo 2 toma la delantera");
                    caballo2 = !(empate = caballo1 = false);
                }
            }
        }
        if (empate) {
            System.out.println("Termina la carrera y empatan los caballos");
        } else if (caballo1) {
            System.out.println("Termina la carrera y gana el caballo 1");
        } else {
            System.out.println("Termina la carrera y gana el caballo 2");
        }
        int diferencia=Math.abs(totalC1-totalC2);
        System.out.println("La distancia maxima entre los caballos fue de " + diferencia);
    }*/
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fp24_4;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class FP24_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea un programa que permita al usuario indicar cuantos alumnos tiene (N),
        después ingresar las calificaciones de sus N alumnos y finalmente pueda
        indicar una calificación para que tu programa indique cuantos alumnos están
        por encima de esa calificación
        */
        /*Entrada
        4
        100
        80
        50
        70
        75*/
        //Declarar el arreglo
//        tipo[] variable;
//        //Inicializar el arreglo
//        variable=new tipo[tamaño];
//        
//        //Declarar e inicializar
//        tipo[] variable=new tipo[tamaño];
//        tipo variable[]=new tipo[tamaño];
        //float[] calificaciones=new float[4];
//        //Asignación directa por posicion
//        calificaciones[0]=100;
//        calificaciones[1]=0;
//        calificaciones[2]=90;
//        calificaciones[3]=80;
//        //Intenta imprimir los valores (no funciona)
//        //System.out.println(calificaciones);
//        //arreglo.length permite consultar el tamaño del arreglo
//        for (int i = 0; i < calificaciones.length ; i++) {
//            System.out.println(calificaciones[i]);
//        }
//        
//        //Crear un arreglo con valores iniciales
//        int arreglo[]=new int[]{10,20,30,40,50};
//        int arreglo2[]={10,20,30,40,50};

        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        float[] calificaciones=new float[n];
        //Leemos las calificaciones y las guardamos
        for (int i = 0; i < n; i++) {
            calificaciones[i]=lector.nextFloat();
        }
        
        int calificacionMin=lector.nextInt();
        int cont=0;
        //Contar las calificaciones que estan por encima de la minima
        for (int i = 0; i < n; i++) {
            if(calificaciones[i]>=calificacionMin){
                cont++;
            }
        }
        System.out.println(cont);
    }
    
}

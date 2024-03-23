/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24_4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class ArregloSerie {
    /*
    Realiza un programa que como entrada reciba un número impar
    y a partir de él genere un arreglo con la siguiente serie:
    Entrada: 7
    Salida: 3 2 1 0 1 2 3
    Entrada: 5
    Salida:  2 1 0 1 2 
    Entrada: 9
    Salida: 4 3 2 1 0 1 2 3 4    
    */
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int n=lector.nextInt();
        int arreglo[]=new int[n];
        int valor=n/2;
        for (int i = 0; i < n; i++) {
            arreglo[i]=Math.abs(valor);
            valor--;
        }
        
        //Imprimir los valores almacenados
        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + " ");
        }
        
    }
}

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
public class InvertirCase {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        //char caracter=(char)lector.nextInt();
        //int caracter=lector.nextInt();
        char caracter=lector.next().charAt(0); //'a'="attugj"
        //char caracter=(char)lector.nextByte(); //Rango de caracteres descartado fuera del valor de los byte
        if(caracter>=65 && caracter<=90){
            System.out.println((char)(caracter+32));
        }
    }
}

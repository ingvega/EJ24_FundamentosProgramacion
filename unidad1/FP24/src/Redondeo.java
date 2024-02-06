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
public class Redondeo {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        float total=lector.nextFloat(); //7.89
        float cobro=(int)total; //7
        float decimal=total-cobro; //0.89
        System.out.println(total);
        System.out.println(decimal);
        if(total<0.5){
            cobro=0.5f;
        }else{
            if(decimal>=0.5 && decimal<0.8){
                cobro+=0.5;
            }else if(decimal>=0.8){
                cobro+=1;
            }
        }
        System.out.println(cobro);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24;

/**
 *
 * @author paveg
 */
public class Conversiones {
    public static void main(String[] args) {
        int i=256455600;
        byte b=25;
        short s=30000;
        long l=3000888000000L;
        l=i;
        i=b;
        i=(int)l;
        l=(int)l;
        System.out.println(l);
        float f=3.5f;
        float f2=(float) 3.5;
        double d=3.142516182883733;
        int x=4*3.5/10;
        int x1=4*(int)3.5/10;
        int x2=(int)4*3.5/10;
    }
}

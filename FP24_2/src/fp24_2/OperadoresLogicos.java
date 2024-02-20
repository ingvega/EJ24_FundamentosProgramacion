/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24_2;

/**
 *
 * @author paveg
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        
        int x,y;
        boolean r,z;
        
        x=8;
        y=10;
        z=true;
        r=x>y && z && (!z || x*4<y);              
        System.out.println(r);
        
        x=8;
        y=10;
        z=true;
        r=x>y && z && (!z || x*4<y);
        x=5;
        y=3;
        z=false;
        
        System.out.println(r);
        
        
//        
//        
//        boolean nevando=false;
//        nevando=true;
//        int temperatura=5;
//        if(nevando && temperatura>=20 ||  !temperatura<=30){
//            System.out.println("No me lo creo");
//        }
    }
}

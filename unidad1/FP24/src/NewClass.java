/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        double parteDecimal = cantidad - Math.floor(cantidad);
        if(cantidad <= 0.5){
            System.out.println("0.5");
        }else if (parteDecimal < 0.5) {
            System.out.println(Math.floor(cantidad));
        } else if (parteDecimal>=0.5 && parteDecimal<0.8) {
            System.out.println((Math.floor(cantidad) + 0.5));
        } else {
            System.out.println(Math.ceil(cantidad));
}
}
}
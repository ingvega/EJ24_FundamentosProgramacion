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
public class Cuadrados {

    /*
Izq           Central     Der         Nuevo Color
0	0	0	0
0	0	1	1
0	1	0	0
0	1	1	1
1	0	0	0
1	0	1	1
1	1	0	0
1	1	1	1
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        int c1 = lector.nextInt(), c2 = lector.nextInt(), c3 = lector.nextInt();
        int vIzq, vDer, vCentro, nC1, nC2, nC3, color=0;

        //Ciclo para aplicar n veces la regla
        for (int i = 1; i <= n; i++) {
            //Aplicar la regla con c1
            vCentro = c1;
            vIzq = c3;
            vDer = c2;
            if (vIzq == 0 && vCentro == 0 && vDer == 0) {
                color = 0;
            } else if (vIzq == 0 && vCentro == 0 && vDer == 1) {
                color = 1;
            } else if (vIzq == 0 && vCentro == 1 && vDer == 0) {
                color = 0;
            } else if (vIzq == 0 && vCentro == 1 && vDer == 1) {
                color = 1;
            } else if (vIzq == 1 && vCentro == 0 && vDer == 0) {
                color = 0;
            } else if (vIzq == 1 && vCentro == 0 && vDer == 1) {
                color = 1;
            } else if (vIzq == 1 && vCentro == 1 && vDer == 0) {
                color = 0;
            } else if (vIzq == 1 && vCentro == 1 && vDer == 1) {
                color = 1;
            }
            nC1=color;
            //Buscar el nuevo color del vecino c2
            vCentro = c2;
            vIzq = c1;
            vDer = c3;
            if (vIzq == 0 && vCentro == 0 && vDer == 0) {
                color = 0;
            } else if (vIzq == 0 && vCentro == 0 && vDer == 1) {
                color = 1;
            } else if (vIzq == 0 && vCentro == 1 && vDer == 0) {
                color = 0;
            } else if (vIzq == 0 && vCentro == 1 && vDer == 1) {
                color = 1;
            } else if (vIzq == 1 && vCentro == 0 && vDer == 0) {
                color = 0;
            } else if (vIzq == 1 && vCentro == 0 && vDer == 1) {
                color = 1;
            } else if (vIzq == 1 && vCentro == 1 && vDer == 0) {
                color = 0;
            } else if (vIzq == 1 && vCentro == 1 && vDer == 1) {
                color = 1;
            }
            nC2=color;
             //Buscar el nuevo color del vecino c3
            vCentro = c3;
            vIzq = c2;
            vDer = c1;
            if (vIzq == 0 && vCentro == 0 && vDer == 0) {
                color = 0;
            } else if (vIzq == 0 && vCentro == 0 && vDer == 1) {
                color = 1;
            } else if (vIzq == 0 && vCentro == 1 && vDer == 0) {
                color = 0;
            } else if (vIzq == 0 && vCentro == 1 && vDer == 1) {
                color = 1;
            } else if (vIzq == 1 && vCentro == 0 && vDer == 0) {
                color = 0;
            } else if (vIzq == 1 && vCentro == 0 && vDer == 1) {
                color = 1;
            } else if (vIzq == 1 && vCentro == 1 && vDer == 0) {
                color = 0;
            } else if (vIzq == 1 && vCentro == 1 && vDer == 1) {
                color = 1;
            }
            nC3=color;
            c1=nC1;
            c2=nC2;
            c3=nC3;
        }
        System.out.println(c1+" "+ c2 + " " +c3);
    }
}

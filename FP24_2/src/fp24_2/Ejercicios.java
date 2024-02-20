/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24_2;

/**
 *
 * @author paveg
 */
public class Ejercicios {

    public static void main(String[] args) {

        int c = 0;

        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Insuficiente");
                break;
            case 6:
            case 7:
                System.out.println("Suficiente");
                break;
            case 8:
            case 9:
                System.out.println("Notable");
                break;
            case 10:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("No válido");
        }

        if (c >= 0 && c < 6) {
            System.out.println("Insuficiente");
        } else {
            if (c >= 6 && c < 8) {
                System.out.println("Suficiente");
            } else {
                if (c >= 8 && c < 10) {
                    System.out.println("Notable");
                } else {
                    if (c == 10) {
                        System.out.println("Excelente");
                    } else {
                        System.out.println("No válido");
                    }
                }
            }
        }

        if (c >= 0 && c < 6) {
            System.out.println("Insuficiente");
        }
        if (c >= 6 && c < 8) {
            System.out.println("Suficiente");
        }
        if (c >= 8 && c < 10) {
            System.out.println("Notable");
        }
        if (c == 10) {
            System.out.println("Excelente");
        }
        if (c < 0 || c > 10) {
            {
                System.out.println("No válido");
            }

            if (c >= 0 && c < 6) {
                System.out.println("Insuficiente");
            } else if (c >= 6 && c < 8) {
                System.out.println("Suficiente");
            } else if (c >= 8 && c < 10) {
                System.out.println("Notable");
            } else if (c == 10) {
                System.out.println("Excelente");
            } else {
                System.out.println("No válido");
            }

        }

        int x = 20, y = 50;
        boolean z = false;

        if ((x % 4 == 0 && y % 4 == 0)
                || (x % 5 == 0 && !(y % 4 == 0))) {
            System.out.println("m1");
        }

        if ((x % 4 == 0 && y % 4 == 0)
                || (x % 5 == 0 && !(y % 4 == 0))
                || !z) {
            System.out.println("m2");
        }

        x = 20;
        y = 25;
        z = true;

        if ((x % 10 == 0 && y % 10 == 0)
                && (x % 5 != 0 && !(y % 4 == 0 && x * y % 4 == 0))) {
            System.out.println("m3");
        } else {
            System.out.println("m4");
        }

        if (!(x % 4 == 0) || !z) {
            System.out.println("m2");
        }

    }
}

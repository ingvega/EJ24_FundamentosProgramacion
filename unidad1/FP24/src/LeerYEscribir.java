
import java.util.Scanner;

public class LeerYEscribir {

    public static void main(String[] a) {
        //Solicitar dos números e imprimir su suma
        int num1, num2, suma = 0;
        Scanner lector = new Scanner(System.in);
        //Leer los números
        System.out.println("Ingresa el primer valor a sumar");
        num1 = lector.nextInt();
        System.out.println("Ingresa el segundo valor a sumar");
        num2 = lector.nextInt();

        suma = num1 + num2;
        //La suma de 10 + 20 es 30
        System.out.println("La suma de " + num1 + " + " + num2 + " es " + suma);
        System.out.printf("La suma de %d + %d es %d\n", num1, num2, suma);
    }
}

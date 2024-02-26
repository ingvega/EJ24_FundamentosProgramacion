/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24_2;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Animales {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String clasificacion1,
                clasificacion2,
                clasificacion3;
        clasificacion1 = lector.nextLine();
        clasificacion2 = lector.nextLine();
        clasificacion3 = lector.nextLine();

        String resultado=clasificacion1.equals("vertebrado")?
                                        clasificacion2.equals("ave")?
                                            clasificacion3.equals("carnivoro")?
                                                "aguia":
                                                "pomba"
                                            :clasificacion3.equals("onivoro")?
                                                "homem":
                                                "vaca"
                                        :clasificacion2.equals("inseto")?
                                            clasificacion3.equals("hematofago")?
                                                "pulga":
                                                "lagarta"
                                        :clasificacion3.equals("hematofago")?
                                                "sanguessuga":
                                                "minhoca";      
        System.out.println(resultado);
        
        if (clasificacion1.equals("vertebrado")) {
            if (clasificacion2.equals("ave")) {
                
                /*String resultado=clasificacion3.equals("carnivoro")?"aguia":"pomba";
                System.out.println("El animal es " + resultado);*/
                /*Cuando el operador ternario se coloca en una expresión donde hay mas operadores, deberá 
                tenerse en consideración que este tiene una prioriad menor aún que la suma y resta, por lo*/
                System.out.println("El animal es " + 
                        (clasificacion3.equals("carnivoro")?"aguia":"pomba")
                        );
                
                if (clasificacion3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (clasificacion3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (clasificacion2.equals("inseto")) {
                if (clasificacion3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (clasificacion3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}

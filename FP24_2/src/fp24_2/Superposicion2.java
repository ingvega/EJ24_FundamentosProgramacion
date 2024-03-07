/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fp24_2;

/**
 *
 * @author paveg
 */
import java.util.Scanner;

public class Superposicion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T1Xmin=0, T1Ymin=0, T1Xmax=0, T1Ymax=0, 
                T2Xmin=0, T2Ymin=0, T2Xmax=0, T2Ymax=0;
        int T1Base, T1Altura, T2Base, T2Altura;
        int a1= input.nextInt();
        int b1= input.nextInt();
        int a2= input.nextInt();
        int b2= input.nextInt();
        int a3= input.nextInt();
        int b3= input.nextInt();
        int a4= input.nextInt();
        int b4= input.nextInt();

        int c1= input.nextInt();
        int d1= input.nextInt();
        int c2= input.nextInt();
        int d2= input.nextInt();
        int c3= input.nextInt();
        int d3= input.nextInt();
        int c4= input.nextInt();
        int d4= input.nextInt();
        //Maxima T1
        if(a1>T1Xmax){ T1Xmax=a1;}
        if (a2>T1Xmax){ T1Xmax=a2; }
        if (a3>T1Xmax){ T1Xmax=a3; }
        if (a4>T1Xmax){ T1Xmax=a4; }
        
        if(b1>T1Ymax){ T1Ymax=b1; }
        if (b2>T1Ymax){ T1Ymax=b2; }
        if (b3>T1Ymax){ T1Ymax=b3; }
        if (b4>T1Ymax){ T1Ymax=b4;}
        
        //Minimo T1
        if(a1<T1Xmin){ T1Xmin=a1;}
        if (a2<T1Xmin){ T1Xmin=a2; }
        if (a3<T1Xmin){ T1Xmin=a3; }
        if (a4<T1Xmin){ T1Xmin=a4; }
        
        if(b1<T1Ymin){ T1Ymin=b1; }
        if (b2<T1Ymin){ T1Ymin=b2; }
        if (b3<T1Ymin){ T1Ymin=b3; }
        if (b4<T1Ymin){ T1Ymin=b4;}
        
        //Maxima T2
        if(c1>T2Xmax){ T2Xmax=c1;}
        if (c2>T2Xmax){ T2Xmax=c2; }
        if (c3>T2Xmax){ T2Xmax=c3; }
        if (c4>T2Xmax){ T2Xmax=c4; }
        
        if(d1>T2Ymax){ T2Ymax=d1; }
        if (d2>T2Ymax){ T2Ymax=d2; }
        if (d3>T2Ymax){ T2Ymax=d3; }
        if (d4>T2Ymax){ T2Ymax=d4;}
        
        //Minimo T2
        if(c1<T2Xmin){ T2Xmin=c1;}
        if (c2<T2Xmin){ T2Xmin=c2; }
        if (c3<T2Xmin){ T2Xmin=c3; }
        if (c4<T2Xmin){ T2Xmin=c4; }
        
        if(d1<T2Ymin){ T2Ymin=d1; }
        if (d2<T2Ymin){ T2Ymin=d2; }
        if (d3<T2Ymin){ T2Ymin=d3; }
        if (d4<T2Ymin){ T2Ymin=d4;}
        
        T1Altura=T1Ymax-T1Ymin;
        T2Altura=T2Ymax-T2Ymin;
        T1Base=T1Xmax-T1Xmin;
        T2Base=T2Xmax-T2Xmin;
        
        if(T1Xmax==T2Xmax && T1Ymax==T2Ymax &&
                T1Xmin==T2Xmin && T1Ymin==T2Ymin){
            System.out.println("HAN GANADO Ambas tarjetas han coincidido");
        }else if((T1Altura==T2Altura && T1Base==T2Base) || 
                (T1Altura==T2Base && T1Base==T2Altura)){
            System.out.println("IGUALES pero no coinciden");
        }else{
            System.out.println("HAN PERDIDO");
        }


        

    }

}

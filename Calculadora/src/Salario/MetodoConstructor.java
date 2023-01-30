package Salario;

import java.util.Scanner;

public class MetodoConstructor {
    private Scanner teclado;
    private int[] sueldos;
    private float irpf;
    public MetodoConstructor()
    {
            teclado = new Scanner(System.in);
            sueldos = new int[5];
                for(int f=0; f<5;f++) 
                { System.out.println("Ingrese el valor del sueldo: ");
            sueldos[f] = teclado.nextInt();
        }
    }
    
    public void irpf() {
        for (int f=0; f<5;f++)
        {   System.out.println("IRPF: "+ (sueldos[f]*0.15));}
    //Crear metodo para saber el 15% de cada sueldo
    }
    public void imprimir() {
        for (int f=0;f<5;f++)
        { System.out.println("Sueldo "+f+" : "+sueldos[f]);
        }
    }
    public void media() {
        int suma=0;
        for(int f=0;f<5;f++) 
            { suma+=sueldos[f]; }
            System.out.println("La suma de sueldos es € "+suma);
            System.out.println("La media es "+suma/sueldos.length);
    }         


    public static void main (String[]args) {
        MetodoConstructor operario = new MetodoConstructor();
        operario.imprimir();
        operario.media();
        operario.irpf();
    
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Funciones7 {
    public static void main (String [] args) {

        System.out.println("El orden de mayor a menor es: " + ordeNumeros(null));


    }
    public static int[] ordeNumeros(int[] numeros) {
        Scanner s = new Scanner(System.in);
        numeros = new int [3];

		for (int i = 0; i<3; i++)
        {   System.out.println("Introduce tres números: "); 
		numeros[i] = s.nextInt();
        }
        Arrays.sort(numeros);
        return numeros;
	
    }
}
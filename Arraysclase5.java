public class Arraysclase5 {
    public static void main (String [] args) {
        int[][] array = {{2,3}, {5,6}, {9,10}};

            for (int[] subArray : array) {
             for (int element : subArray) {  //Element hereda el valor de cada posicion del array
             System.out.print(element + " ");
        }
        System.out.println();
        }

    }
    
}


//Array de 3 numeros, 1 solo for, subArray -> int A, en Sout fuera de bucle poner "print A"
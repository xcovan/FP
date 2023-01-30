public class Arrayclase2 {
        public static void main (String [] args) {
    
            String [][] n = {{"Diez","20"},{"Treinta","40"},{"Sesenta","90"}};   //Array de 3 filas por 2 columnas
    
            int fila, columna;

            for(fila = 0; fila <3; fila++) {
    
                for(columna = 0; columna <2; columna++) {
                    System.out.print(n[fila][columna]);
                
                }
                System.out.println();
            }
        }
     }
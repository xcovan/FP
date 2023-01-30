public class Arrayclase4 {
    public static void main (String [] args) {
        double[] nota = new double[8];
        System.out.println("Para calcular la nota media necsito saber la \n nota de cada uno de tus examenes.  ");
    
        for (int i= 0; i <8; i++) {
            System.out.print("nota del examen nº "+ (i + 1) + ": ");
            nota[i] = Double.parseDouble(System.console().readLine());
        }
        System.out.println("tus notas son: ");
        double suma= 0;

        for (double n: nota) { //For al estilo foreach
        System.out.println(n + " ");
        suma += n;
    }
    double i=0;
    double fin= nota.length;
    
        for (i= fin-2; i<2; i++) {
  
            System.out.println("Las notas finales son: " );

        }
        System.out.println("\nLa media es "+ suma / 8);
    }
}
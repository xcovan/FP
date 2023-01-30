import java.util.Arrays;
public class Arraysclase6 {
    public static void main (String [] args) {
        int index = 0;
        String [] datos = {"Alberto", "Ana", "Eva"};
        index = Arrays.asList(datos).indexOf("Alberto");

        if (index <=0)
        { System.out.println("Encontrado el indice: "+ index); }
        else 
        { System.out.println("No encontrado"+ index);  }

    }
    
}

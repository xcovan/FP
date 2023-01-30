import javax.sound.sampled.SourceDataLine;

public class Loginclase {
    public static void main (String [] args) {
        String usuario;
        String contraseña;

        System.out.println("Introducir usuario: ");
             usuario = System.console().readLine();

        System.out.println("Contraseña: ");
             contraseña = System.console().readLine();

         if (usuario.length() < 8)
         { System.out.println("Usuario incorrecto");
        }
        if (contraseña.length() < 8)
        {   System.out.println("Contraseña demasiado corta."); 
        }

        

        System.out.println(usuario +"\n" + contraseña); 
    }
    
    
}

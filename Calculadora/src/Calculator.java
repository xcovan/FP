public class Calculator {
    public static void main(String[] args) throws Exception {
        funcCalculadora miCalculadora = new funcCalculadora();

        System.out.println(miCalculadora.suma() + miCalculadora.producto());
    }
}

import java.util.Scanner;

class funcCalculadora {

    public int suma() {

            Scanner s = new Scanner(System.in);
            System.out.print("indica el primer número: "); 
            int a = s.nextInt();
            System.out.print("indica el segundor número: "); 
            int b = s.nextInt();

            return a + b;
            
        }
        public int resta() {

            Scanner s = new Scanner(System.in);
            System.out.print("indica el primer número: "); 
            int a = s.nextInt();
            System.out.print("indica el segundor número: "); 
            int b = s.nextInt();

            return a - b;
        }
        public int producto() {

            Scanner s = new Scanner(System.in);
            System.out.print("indica el primer número: "); 
            int a = s.nextInt();
            System.out.print("indica el segundor número: "); 
            int b = s.nextInt();

            return a * b;
        }
        public int division() {

            Scanner s = new Scanner(System.in);
            System.out.print("indica el primer número: "); 
            int a = s.nextInt();
            System.out.print("indica el segundor número: "); 
            int b = s.nextInt();

            return a / b;
        }
        public double Raiz() 
        {   Scanner s = new Scanner(System.in);
            System.out.print("indica el número: "); 
            int a = s.nextInt();

            return Math.sqrt(a);
        }
}

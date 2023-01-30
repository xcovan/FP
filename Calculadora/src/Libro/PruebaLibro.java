package Libro;
public class PruebaLibro {
    public static void main (String[] args) {
            Libro libro1 = new Libro();
            Libro libro2 = new Libro();
            Libro libro3 = new Libro();
            Libro libro4 = new Libro();

            //dar valores al objeto libro1
            libro1.autor="Tolkien";
            libro1.isbn="1";
            libro1.numeroDePaginas=200;
            libro1.titulo="El Hobbit";
            libro1.precio="19,90 eur";

            libro2.autor="Frank Herbert"; 
            libro2.isbn="2";
            libro2.numeroDePaginas=400; 
            libro2.titulo="Dune";
            libro2.precio="8,90 eur";

            libro3.autor="Cervantes";
            libro3.isbn="3";
            libro3.numeroDePaginas=1200;
            libro3.titulo="El Quijote";
            libro3.precio="12,70 eur";

            libro4.autor="Desconocido";
            libro4.isbn = "4";
            libro4.numeroDePaginas=5;
            libro4.titulo="El principito";
            libro4.precio="3,10 eur";


            System.out.println(libro1.titulo+ " - " + libro1.autor+" - "+libro1.isbn+" - "+libro1.numeroDePaginas+" - "+libro1.precio);
            System.out.println(libro2.titulo+" - "+libro2.autor+" - "+libro2.isbn+" - "+libro2.numeroDePaginas+" - "+libro2.precio);
            System.out.println(libro3.titulo+" - "+libro3.autor+" - "+libro3.isbn+" - "+libro3.numeroDePaginas+" - "+libro3.precio);
            System.out.println(libro4.titulo+" - "+libro4.autor+" - "+libro4.isbn+" - "+libro4.numeroDePaginas+" - "+libro4.precio);

    }
    
}

import Establo.Arbol;
import Establo.Planta;

import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n ------- PARTE 1: LIBRO --------------\n");
        Libro Austen = new Libro("Pride & Prejudice", 9780140430721L, 25.99);

        System.out.println(Austen.getTitle());
        System.out.println(Austen.getISBN());
        System.out.println(Austen.getPrice());

        System.out.println("\n ------- PARTE 2: LA GRANJA -------------- \n");
        Arbol encina =new Arbol("Encina encinae", 20, "Mediterraneo");

        System.out.println(encina);

        Planta potus = new Planta( "Potus poti", true, "No tiene");

        System.out.println(potus);



    }
}

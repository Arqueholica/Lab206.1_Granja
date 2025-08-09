import Invernadero.Arbol;
import Invernadero.Planta;
import Establo.AnimalDomestico;
import Establo.AnimalSalvaje;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n ------- PARTE 1: LIBRO --------------\n");
        Libro Austen = new Libro("Pride & Prejudice", 9780140430721L, 25.99);

        System.out.println(Austen.getTitle());
        System.out.println(Austen.getISBN());
        System.out.println(Austen.getPrice());

        System.out.println("\nLibro completo: \n ");
        System.out.println(Austen);

        System.out.println("\n ------- PARTE 2: EL INVERNADERO -------------- \n");
        Arbol encina =new Arbol("Encina encinae", 20, "Mediterraneo");

        System.out.println(encina);

        Planta potus = new Planta( "Potus poti", true, "No tiene");

        System.out.println(potus);

        System.out.println(potus.getPino());
        System.out.println(potus.getLongevidad());



        System.out.println("\n ------- PARTE 2.1: LA GRANJA -------------- \n");

        AnimalSalvaje bufalo = new AnimalSalvaje("Bubalus bubalis - 'Búfalo'", 4, "Ecosistemas con abundante agua", false);

        System.out.println(bufalo);

        System.out.println(bufalo.getNumPatas());
        System.out.println(bufalo.getHabitat());
        System.out.println();

        AnimalDomestico perro = new AnimalDomestico("Canis lupus familiaris - 'Perro'", 4, true, "Indiana", "Beagle");

        System.out.println(perro);

        System.out.println(perro.isCouchPotato());
        System.out.println(perro.getNumPatas());
        System.out.println();

        perro.setCouchPotato(false);
        perro.setNumPatas(7);

        System.out.println(perro);



    }
}

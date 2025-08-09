package Invernadero;

public class AnimalDomestico extends  Animales{
    private boolean isCouchPotato;
    private String name;
    private String tipo;


    public AnimalDomestico(String especie, int numPatas, boolean isCouchPotato, String name, String tipo) {
        super(especie, numPatas);
        this.isCouchPotato = isCouchPotato;
        this.name = name;
        this.tipo = tipo;
    }

    public boolean isCouchPotato() {
        return isCouchPotato;
    }

    public boolean setCouchPotato(boolean couchPotato) {
        isCouchPotato = couchPotato;
        return couchPotato;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "🐶 Animal Domestico" + '\n' +
                "Especie: " + especie + '\n' +
                "Número de patas: " + numPatas + '\n' +
                "¿Es una 'couch potato'? " + ((isCouchPotato)? "Sí":"No") + '\n' +
                "Nombre: " + name + '\n' +
                "Raza del animal: " + tipo +'\n';
    }
}

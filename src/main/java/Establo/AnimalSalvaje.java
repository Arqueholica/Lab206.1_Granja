package Establo;

public class AnimalSalvaje extends Animales {
    private String habitat;
    private boolean isVenenoso;


    public AnimalSalvaje(String especie, int numPatas, String habitat, boolean isVenenoso) {
        super(especie, numPatas);
        this.habitat = habitat;
        this.isVenenoso = isVenenoso;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isVenenoso() {
        return isVenenoso;
    }

    public void setVenenoso(boolean venenoso) {
        isVenenoso = venenoso;
    }


    @Override
    public String toString() {
        return "🐍 Animal Salvaje" + '\n' +
                "Especie: " + especie  + '\n' +
                "Número de patas: " + numPatas + '\n' +
                "¿Es venenoso? " + ((isVenenoso)?"Sí":"No") + '\n' +
                "Habitat: " + habitat + '\n';
    }
}

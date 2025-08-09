package Invernadero;

abstract class Animales {
protected String especie;
protected int numPatas;


    public Animales(String especie, int numPatas) {
        this.especie = especie;
        this.numPatas = numPatas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public int setNumPatas(int numPatas) {
        this.numPatas = numPatas;
        return numPatas;
    }


    @Override
    public String toString() {
        return "🐶 ANIMAL 🐍" + + '\n' +
                "Especie: " + especie + '\n' +
                "Número de patas: " + numPatas + '\n';
    }
}

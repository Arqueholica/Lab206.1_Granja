package Establo;

public class Arbol {

    public String especie;
    private int longevidad;
    String clima;

    public Arbol(String especie, int longevidad, String clima) {
        this.especie = especie;
        this.longevidad = longevidad;
        this.clima = clima;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getLongevidad() {
        return longevidad;
    }

    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }

    public String getHClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    @Override
    public String toString() {
        return "ÁRBOL \n" +
                "Especie: " + especie + '\n' +
                "Longevidad: " + longevidad + " años" + '\n' +
                "Clima: " + clima + '\n';
    }
}

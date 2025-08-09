package Invernadero;

public class Planta {
    public String especie;
    private boolean isInterior;
    String tipoFlores;

/*
importar arbol --> instanciar ---> métodos para accedeer a las propiedades
 */
    Arbol pino = new Arbol("Pino pinus", 80, "Atlántico");

    public Arbol getPino() {
        return pino;
    }

  public int getLongevidad(){
        return pino.getLongevidad();
  }

    public Planta(String especie, boolean isInterior, String tipoFlores) {
        this.especie = especie;
        this.isInterior = isInterior;
        this.tipoFlores = tipoFlores;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isInterior() {
        return isInterior;
    }

    public void setInterior(boolean interior) {
        isInterior = interior;
    }

    public String getTipoFlores() {
        return tipoFlores;
    }

    public void setTipoFlores(String tipoFlores) {
        this.tipoFlores = tipoFlores;
    }


    @Override
    public String toString() {
        return "🪴 PLANTA \n" +
                "Especie: " + especie + '\n' +
                "Para interior: " + ((isInterior)? "Sí":"No") + '\n' +
                "Tipo de flores: " + tipoFlores + '\n';
    }
}

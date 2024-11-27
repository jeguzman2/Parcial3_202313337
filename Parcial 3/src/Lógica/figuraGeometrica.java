
package Lógica;

public class figuraGeometrica {
    private String tipoFigura;
    private int rojo;
    private int verde; 
    private int azul; 

    public figuraGeometrica(String tipo, int rojo, int verde, int azul) {
        this.tipoFigura = tipo;
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    

   
    public String getTipoFigura() {
        return tipoFigura;
    }




    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }




    public int getRojo() {
        return rojo;
    }




    public void setRojo(int rojo) {
        this.rojo = rojo;
    }




    public int getVerde() {
        return verde;
    }




    public void setVerde(int verde) {
        this.verde = verde;
    }




    public int getAzul() {
        return azul;
    }




    public void setAzul(int azul) {
        this.azul = azul;
    }




    public String obtenerColorAString() {
        return "RGB(" + rojo + ", " + verde + ", " + azul + ")";
    }
}


package Controlador;

import Lógica.figuraGeometrica;

public class ventanaContralodora {
    private figuraGeometrica figuraGeometrica;

    public ventanaContralodora() {
        
        this.figuraGeometrica = new figuraGeometrica("Cuadrado", 255, 255, 255);
    }
    // Métodos para cambiar el tipo de figura
    public void cambiarATipo(String tipo) {
        figuraGeometrica.setTipoFigura(tipo);
    }
    public void cambiardsorDeColor(int rojo, int verde, int azul) {
        figuraGeometrica.setRojo(rojo);
        figuraGeometrica.setVerde(verde);
        figuraGeometrica.setAzul(azul);
    }
    public figuraGeometrica getTipoFigura() {
        return getTipoFigura();
    }
}

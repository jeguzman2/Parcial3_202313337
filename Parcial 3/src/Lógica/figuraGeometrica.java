
package Lógica;

public class figuraGeometrica {
    private String tipo; // Puede ser "Cuadrado" o "Circulo"
    private int red; // Valor R (0-255)
    private int green; // Valor G (0-255)
    private int blue; // Valor B (0-255)

    public figuraGeometrica(String tipo, int red, int green, int blue) {
        this.tipo = tipo;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

   
    public String getColor() {
        return "RGB(" + red + ", " + green + ", " + blue + ")";
    }
}

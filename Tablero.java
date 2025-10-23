public class Tablero {
    String color;
    String material;
    String tamaño;
    String tipo;
    String marca;
    String forma;
    double altura;

    public Tablero(String color, String material, String tamaño, String tipo, String marca, String forma, double altura) {
        this.color = color;
        this.material = material;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.marca = marca;
        this.forma = forma;
        this.altura = altura;
    }

    public static void main(String[] args) {
        Tablero tablero = new Tablero("Blanco", "Acrílico", "Grande", "Marcador", "Pilot", "Rectangular", 1.8);
        Tablero tablero2 = new Tablero("Verde", "Madera", "Mediano", "Tiza", "Staedtler", "Cuadrado", 1.5);
        Tablero tablero3 = new Tablero("Negro", "Vidrio", "Pequeño", "Marcador", "Expo", "Ovalado", 1.2);
        Tablero tablero4 = new Tablero("Azul", "Plástico", "Grande", "Tiza", "Faber-Castell", "Rectangular", 1.7);
        Tablero tablero5 = new Tablero("Amarillo", "Metal", "Mediano", "Marcador", "Bic", "Cuadrado", 1.6);
    }
}

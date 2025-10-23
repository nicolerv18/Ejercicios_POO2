public class ParedVidrio {
    String estado;
    String cerradura;
    int cantidadPestañas;
    double longitud;
    double altura;

    public ParedVidrio(String estado, String cerradura, int cantidadPestañas, double longitud, double altura) {
        this.estado = estado;
        this.cerradura = cerradura;
        this.cantidadPestañas = cantidadPestañas;
        this.longitud = longitud;
        this.altura = altura;
    }

    public static void main(String[] args) {
        ParedVidrio pared = new ParedVidrio("Transparente", "Magnética", 3, 4.0, 2.5);
    }
}

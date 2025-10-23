public class CableVideo {
    String tipo;
    double longitud;
    String color;
    String estado;

    public CableVideo(String tipo, double longitud, String color, String estado) {
        this.tipo = tipo;
        this.longitud = longitud;
        this.color = color;
        this.estado = estado;
    }

    void transmitirDatos() {}

    public static void main(String[] args) {
        CableVideo cable = new CableVideo("HDMI", 1.5, "Negro", "Nuevo");
        CableVideo cable2 = new CableVideo("VGA", 2.0, "Azul", "Usado");
        CableVideo cable3 = new CableVideo("DVI", 1.0, "Blanco", "Nuevo");
        CableVideo cable4 = new CableVideo("DisplayPort", 1.8, "Gris", "Usado");
        CableVideo cable5 = new CableVideo("RCA", 3.0, "Rojo", "Nuevo");
    }
}

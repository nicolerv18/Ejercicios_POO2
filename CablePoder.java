public class CablePoder {
    String tipo;
    double longitud;
    String color;
    String estado;

    public CablePoder(String tipo, double longitud, String color, String estado) {
        this.tipo = tipo;
        this.longitud = longitud;
        this.color = color;
        this.estado = estado;
    }

    void transmitirEnergia() {}

    public static void main(String[] args) {
        CablePoder cable = new CablePoder("Corriente AC", 1.2, "Negro", "Nuevo");
        CablePoder cable2 = new CablePoder("Corriente DC", 0.8, "Negro", "Usado");
        CablePoder cable3 = new CablePoder("Corriente AC", 2.0, "Negro", "Nuevo");
        CablePoder cable4 = new CablePoder("Corriente DC", 1.5, "Negro", "Usado");
        CablePoder cable5 = new CablePoder("Corriente AC", 1.0, "Negro", "Nuevo");
    }
}


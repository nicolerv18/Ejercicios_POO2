public class Soporte {
    String tipo;
    String material;
    String color;
    String tamaño;
    String marca;
    String modelo;
    String estado;

    public Soporte(String tipo, String material, String color, String tamaño, String marca, String modelo, String estado) {
        this.tipo = tipo;
        this.material = material;
        this.color = color;
        this.tamaño = tamaño;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
    }

    public static void main(String[] args) {
        Soporte soporte = new Soporte("TV", "Metal", "Negro", "Mediano", "LG", "MountPro", "Nuevo");
        Soporte soporte2 = new Soporte("Monitor", "Plástico", "Blanco", "Pequeño", "Samsung", "StandX", "Usado");
        Soporte soporte3 = new Soporte("Proyector", "Aluminio", "Gris", "Grande", "Epson", "ProjMax", "Nuevo");
        Soporte soporte4 = new Soporte("Altavoz", "Madera", "Marrón", "Mediano", "Bose", "SoundStand", "Usado");
        Soporte soporte5 = new Soporte("Cámara", "Plástico", "Negro", "Pequeño", "Canon", "CamMount", "Nuevo");
    }
}

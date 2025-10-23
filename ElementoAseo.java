



public class ElementoAseo {
    String tipo;
    String marca;
    double altura;
    String color;
    String estado;

    public ElementoAseo(String tipo, String marca, double altura, String color, String estado) {
        this.tipo = tipo;
        this.marca = marca;
        this.altura = altura;
        this.color = color;
        this.estado = estado;
    }

    public static void main(String[] args) {
        ElementoAseo escoba = new ElementoAseo("Escoba", "AsearPlus", 1.2, "Verde", "Nuevo");
        ElementoAseo trapeador = new ElementoAseo("Trapeador", "LimpioMax", 1.0, "Azul", "Usado"); 
        ElementoAseo detergente = new ElementoAseo("Detergente", "FuerzaLimpia", 0.5, "Blanco", "Nuevo");
        ElementoAseo desinfectante = new ElementoAseo("Desinfectante", "HigieneTotal", 0.7, "Transparente", "Nuevo");
        ElementoAseo guantes = new ElementoAseo("Guantes", "ProtecManos", 0.3, "Amarillo", "Usado");
    }
}

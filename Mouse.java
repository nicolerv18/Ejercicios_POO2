public class Mouse {
    String tipo;
    String marca;
    String modelo;
    String color;
    int DPI;
    String forma;
    String tamaño;
    String estado;

    public Mouse(String tipo, String marca, String modelo, String color, int DPI, String forma, String tamaño, String estado) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.DPI = DPI;
        this.forma = forma;
        this.tamaño = tamaño;
        this.estado = estado;
    }

    void moverCursor() {}
    void clickear() {}
    void desplazarPestaña() {}

    public static void main(String[] args) {
        Mouse mouse = new Mouse("Inalámbrico", "Logitech", "MX Master 3", "Gris", 16000, "Ergonómica", "Mediano", "Nuevo");
        Mouse mouse2 = new Mouse("Alámbrico", "Razer", "DeathAdder V2", "Negro", 20000, "Ergonómica", "Grande", "Usado");
        Mouse mouse3 = new Mouse("Inalámbrico", "Microsoft", "Surface Mouse", "Plateado", 4000, "Estándar", "Pequeño", "Nuevo");
        Mouse mouse4 = new Mouse("Alámbrico", "Corsair", "Harpoon RGB", "Blanco", 10000, "Estándar", "Mediano", "Usado");
        Mouse mouse5 = new Mouse("Inalámbrico", "Apple", "Magic Mouse 2", "Blanco", 1300, "Estándar", "Pequeño", "Nuevo");
    }
}

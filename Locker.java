public class Locker {
    String color;
    String tamaño;
    String marca;
    String modelo;
    int cantidadCajones;
    String forma;
    String estado;

    public Locker(String color, String tamaño, String marca, String modelo, int cantidadCajones, String forma, String estado) {
        this.color = color;
        this.tamaño = tamaño;
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadCajones = cantidadCajones;
        this.forma = forma;
        this.estado = estado;
    }

    void guardarObjetos() {}

    public static void main(String[] args) {
        Locker locker = new Locker("Gris", "Grande", "MetalBox", "L500", 4, "Rectangular", "Nuevo");
        Locker locker2 = new Locker("Azul", "Mediano", "SafeStore", "S300", 3, "Cuadrado", "Usado");
        Locker locker3 = new Locker("Rojo", "Pequeño", "QuickLock", "Q100", 2, "Cilíndrico", "Nuevo");
        Locker locker4 = new Locker("Negro", "Grande", "SecureIt", "SI700", 5, "Rectangular", "Usado");
        Locker locker5 = new Locker("Blanco", "Mediano", "LockAway", "LA400", 4, "Cuadrado", "Nuevo");
    }
}

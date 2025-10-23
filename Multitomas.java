public class Multitomas {
    String tipo;
    int cantidadTomas;
    String color;
    String tamaño;
    double longitudCable;
    String ubicacion;

    public Multitomas(String tipo, int cantidadTomas, String color, String tamaño, double longitudCable, String ubicacion) {
        this.tipo = tipo;
        this.cantidadTomas = cantidadTomas;
        this.color = color;
        this.tamaño = tamaño;
        this.longitudCable = longitudCable;
        this.ubicacion = ubicacion;
    }

    void aumentarFlujoDeEnergia() {}

    public static void main(String[] args) {
        Multitomas multitomas = new Multitomas("Protegida", 6, "Blanco", "Grande", 2.0, "Oficina");
        Multitomas multitomas2 = new Multitomas("Normal", 4, "Negro", "Mediano", 1.5, "Sala de estar");
        Multitomas multitomas3 = new Multitomas("Con interruptor", 8, "Gris", "Pequeño", 3.0, "Dormitorio");
        Multitomas multitomas4 = new Multitomas("Industrial", 10, "Amarillo", "Grande", 5.0, "Taller");
        Multitomas multitomas5 = new Multitomas("Portátil", 2, "Azul", "Pequeño", 0.5, "Viaje");
    }
}

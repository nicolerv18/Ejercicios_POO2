public class TomaCorriente {
    private String ubicacion;
    private boolean tieneEnergia;

    public TomaCorriente(String ubicacion, boolean tieneEnergia) {
        this.ubicacion = ubicacion;
        this.tieneEnergia = tieneEnergia;
    }

    public void verificar() {
        if (tieneEnergia) {
            System.out.println("Toma en " + ubicacion + " tiene energía disponible.");
        } else {
            System.out.println("Toma en " + ubicacion + " está sin energía.");
        }
    }

    // Instancias de TomaCorriente
    public static void main(String[] args) {
        TomaCorriente t1 = new TomaCorriente("Sala", true);
        TomaCorriente t2 = new TomaCorriente("Cocina", false);
        TomaCorriente t3 = new TomaCorriente("Oficina", true);
        TomaCorriente t4 = new TomaCorriente("Habitación", true);
        TomaCorriente t5 = new TomaCorriente("Patio", false);

        t1.verificar();
        t2.verificar();
        t3.verificar();
        t4.verificar();
        t5.verificar();
    }
}

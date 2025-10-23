public class Adaptador {
    private String entrada;
    private String salida;

    public Adaptador(String entrada, String salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    public void convertir() {
        System.out.println("Adaptador convierte de " + entrada + " a " + salida + ".");
    }

    public static void main(String[] args) {
        Adaptador a1 = new Adaptador("Tipo A", "Tipo C");
        Adaptador a2 = new Adaptador("Tipo B", "Tipo G");
        Adaptador a3 = new Adaptador("Tipo I", "Tipo A");
        Adaptador a4 = new Adaptador("Tipo C", "Tipo B");
        Adaptador a5 = new Adaptador("Tipo G", "Tipo I");

        a1.convertir();
        a2.convertir();
        a3.convertir();
        a4.convertir();
        a5.convertir();
    }
}

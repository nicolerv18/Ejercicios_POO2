class Impresora {
    private String color;
    private String marca;
    private boolean scanner; 

    public Impresora( String color, String marca, boolean scanner){
        this.color=color;
        this.marca=marca;
        this.scanner=scanner;

    }


    public void imprimir(){

       System.out.println("imprimir");
    }
}

public class Main {
    public static void main(String[] args) {
        Impresora impri1 = new Impresora("Negro", "HP", true);
        impri1.imprimir();

        Impresora impri2 = new Impresora("Blanco", "Canon", false);
        impri2.imprimir();

        Impresora impri3 = new Impresora("Gris", "Epson", true);
        impri3.imprimir();

        Impresora impri4 = new Impresora("Rojo", "Brother", false);
        impri4.imprimir();

        Impresora impri5 = new Impresora("Azul", "Samsung", true);
        impri5.imprimir();
    }
}

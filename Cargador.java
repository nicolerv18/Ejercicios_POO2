class Cargador{
    private String cablePoder;
    private String referencia;
    private String color;

    public Cargador( String cablePoder, String referencia, String color){

        this.cablePoder=cablePoder;
        this.referencia=referencia;
        this.color=color;
    }


    public void cargar(){
        System.out.println("cargando");
    }




}

public class Main {
    public static void main(String[] args) {

       Cargador carg1 = new Cargador("USB-C", "X100", "Negro");
       carg1.cargar();

        Cargador carg2 = new Cargador("Lightning", "L200", "Blanco");
        carg2.cargar();

        Cargador carg3 = new Cargador("Micro-USB", "M300", "Azul");
        carg3.cargar();

        Cargador carg4 = new Cargador("USB-A", "A400", "Rojo");
        carg4.cargar();
        
        Cargador carg5 = new Cargador("USB-C", "X500", "Gris");
        carg5.cargar();

    
    
    }
}
    
class Televisor {
    private String marca;
    private byte pulgada;
    private String color; 

    public Televisor( String marca, byte pulgada, String color){
      
        this.marca=marca;
        this.pulgada=pulagada;
        this.color=color;

    }


    public String reproducirImagen(){
        return "Reproducir imagen";
    }


}


public class Main {
    public static void main(String[] args) {
        Televisor televisor1 = new Televisor("Lg", (byte)56, "negro");
        System.out.println(televisor1.reproducirImagen());

        Televisor televisor2 = new Televisor("Samsung", (byte)65, "negro");
        System.out.println(televisor2.reproducirImagen());

        Televisor televisor3 = new Televisor("Kaley", (byte)55, "negro");
        System.out.println(televisor3.reproducirImagen());

        Televisor televisor4 = new Televisor("Lg", (byte)30, "negro");
        System.out.println(televisor4.reproducirImagen());
        
        Televisor televisor5 = new Televisor("Lg", (byte)40, "negro");
        System.out.println(televisor5.reproducirImagen());
    }
}


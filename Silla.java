class Silla {
    private String color; 
    private String  material; 
    private  String modelo;

    public Silla( String color, String material, String modelo){
        this.color=color;
        this.material=material;
        this.modelo=modelo;
    }

    public String desplazamiento(){
        return "La Silla se movio";
    }


}


public class Main {
    public static void main(String[] args) {

     Silla Silla1= new Silla( "azul", "plastico"," M2000 ");
        System.out.println(Silla1.desplazamiento());

        
     Silla Silla2= new Silla( "verde", "plastico"," r2000 ");
      System.out.println(Silla2.desplazamiento());


     Silla Silla3= new Silla( "morada", "metal"," M2000 ");
      System.out.println(Silla3.desplazamiento());


     Silla Silla4= new Silla( "amarilla", "plastico"," M2000 ");
      System.out.println(Silla4.desplazamiento());

      Silla Silla5= new Silla( "rosada", "madera"," M2000 ");
      System.out.println(Silla5.desplazamiento());


    }
}


class Mesa{
    private String color;
    private int altura;
    private int ancho; 

    public Mesa ( String color, int altura, int ancho){
        this.color=color;
        this.altura=altura;
        this.ancho=ancho;

    }


    public void brindarSoporte(){

        System.out.println("Apoyo");
    }

}

 public class Main {
    public static void main(String[] args) {
         
        Mesa mesa1= new Mesa( "Roja", 75, 40);
        mesa1.brindarSoporte();

        Mesa mesa2= new Mesa( "verde", 75, 40);
        mesa2.brindarSoporte();

        Mesa mesa3= new Mesa( "gris", 75, 40);
        mesa3.brindarSoporte();

        Mesa mesa4= new Mesa( "cafe", 75, 40);
        mesa4.brindarSoporte();

        Mesa mesa5= new Mesa( "amarilla", 75, 40);
        mesa5.brindarSoporte();

    }
}
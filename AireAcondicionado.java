class AireAcondicionado{
    private String color;
    private String modelo; 
    private String marca;

    public AireAcondicionado( String color, String modelo, String marca){
        this.color=color;
        this.modelo=modelo;
        this.marca=marca;
    }


    public void Enfriar(){
        System.out.println("Enfriando");
    }
}

public class Main {
    public static void main(String[] args) {

        AireAcondicionado air1= new AireAcondicionado ("blanco", "2003", "chigo");
        air1.Enfriar();

        AireAcondicionado air2= new AireAcondicionado ("blanco", "2003", "chigo");
        air2.Enfriar();

        AireAcondicionado air3= new AireAcondicionado ("blanco", "2003", "chigo");
        air3.Enfriar();

        AireAcondicionado air4= new AireAcondicionado ("blanco", "2003", "chigo");
        air4.Enfriar();

        AireAcondicionado air5= new AireAcondicionado ("blanco", "2003", "chigo");
        air5.Enfriar();

    
    
    
    } 
    
    
}

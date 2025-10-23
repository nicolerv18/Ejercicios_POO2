class Ambiente{
    private int numero;
    private int area;

    public Ambiente( int numero, int area){
        this.numero=numero;
        this.area=area;

    }


     public void realizarClases(){
         System.out.println("Clase realizada");
     }

}

public class Main {
    public static void main(String[] args) {

        Ambiente amb1= new Ambiente(209,3400);
        amb1.realizarClases();

        Ambiente amb2= new Ambiente(210,3400);
        amb2.realizarClases();

        Ambiente amb3= new Ambiente(211,3400);
        amb3.realizarClases();

        Ambiente amb4= new Ambiente(212,3400);
        amb4.realizarClases();

        Ambiente amb5= new Ambiente(213,3400);
        amb5.realizarClases();

        
    }
}

public class Aprendiz {
    String nombre;
    double altura;
    int edad;
    String documento;
    String tipoDocumento;

    public Aprendiz(String nombre, double altura, int edad, String documento, String tipoDocumento) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

    void caminar() {}
    void hablar() {}
    void correr() {}
    void comer() {}

    public static void main(String[] args) {
        Aprendiz aprendiz = new Aprendiz("Johan", 1.72, 18, "1031652982", "CC");
        Aprendiz aprendiz2 = new Aprendiz("Erick", 1.73, 18, "1098765432", "CC");
        Aprendiz aprendiz3 = new Aprendiz("Marlon", 1.77, 21, "1023456789", "CC");
        Aprendiz aprendiz4 = new Aprendiz("Luis", 1.73, 18, "1076543210", "CC");
        Aprendiz aprendiz5 = new Aprendiz("Juan Esteban", 1.73, 19, "1012345678", "CC");
    }
}

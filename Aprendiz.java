public class Aprendiz {
    String nombre;
    String documento;
    String tipoDocumento;

    public Aprendiz(String nombre, String documento, String tipoDocumento) {
        this.nombre = nombre;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

    void caminar() {}
    void hablar() {}
    void comer() {}

    public static void main(String[] args) {
        Aprendiz apren = new Aprendiz("Nicole", "1031652982", "CC");
        Aprendiz apren2 = new Aprendiz("Maria", "1098765432", "TI");
        Aprendiz apren3 = new Aprendiz("Victoria", "1023456789", "CC");
        Aprendiz apren4 = new Aprendiz("Pilar",  "1076543210", "CC");
        Aprendiz apren5 = new Aprendiz("Valentina", "1012345678", "CC");
    }
}
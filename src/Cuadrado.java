public class Cuadrado implements Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
   @override
    public double calcularArea() {
        return lado * lado;
    }
    @override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

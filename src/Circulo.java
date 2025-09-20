public class Circulo implements Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    @override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    @override 
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

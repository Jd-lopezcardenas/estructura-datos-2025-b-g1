public class ClaseRectangulo {
    private double base;
    private double altura;
    private String color;

    public ClaseRectangulo(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void mostrarInformacion() {
        System.out.println("Rectángulo | Base: " + base + ", Altura: " + altura + ", Color: " + color);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("-----------------------------------");
    }
}

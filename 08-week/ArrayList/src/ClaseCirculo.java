public class ClaseCirculo {
    private double radio;
    private String color;

    public ClaseCirculo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void mostrarInformacion() {
        System.out.println("Círculo | Radio: " + radio + ", Color: " + color);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("-----------------------------------");
    }
}

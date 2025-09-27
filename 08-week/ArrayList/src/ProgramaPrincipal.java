import java.util.ArrayList;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        ArrayList<Object> figuras = new ArrayList<>();

        // Agregar Círculos
        figuras.add(new ClaseCirculo(5, "Rojo"));
        figuras.add(new ClaseCirculo(3.2, "Azul"));

        // Agregar Rectángulos
        figuras.add(new ClaseRectangulo(4, 6, "Verde"));
        figuras.add(new ClaseRectangulo(2.5, 3.5, "Amarillo"));

        // Agregar Triángulos
        figuras.add(new ClaseTriangulo(3, 4, 5, "Naranja"));
        figuras.add(new ClaseTriangulo(6, 6, 6, "Morado"));


        // Recorrer el ArrayList
        for (Object figura : figuras) {
            if (figura instanceof ClaseCirculo) {
                ((ClaseCirculo) figura).mostrarInformacion();
            } else if (figura instanceof ClaseRectangulo) {
                ((ClaseRectangulo) figura).mostrarInformacion();
            } else if (figura instanceof ClaseTriangulo) {
                ((ClaseTriangulo) figura).mostrarInformacion();
            }
        }
    }
}


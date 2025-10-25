import java.util.*; // 🔹 Importa todas las clases de util (HashMap, List, ArrayList, etc.)

public class GrafoCiudades {

    private Map<String, List<String>> mapa = new HashMap<>();

    // Agrega una ciudad si no existe
    public void agregarCiudad(String ciudad) {
        mapa.putIfAbsent(ciudad, new ArrayList<>());
    }

    // Conecta dos ciudades (una dirección)
    public void conectar(String a, String b) {
        if (mapa.containsKey(a)) {
            mapa.get(a).add(b);
        } else {
            System.out.println("La ciudad " + a + " no existe en el mapa.");
        }
    }

    // Muestra el grafo completo
    public void mostrar() {
        System.out.println("Mapa de ciudades y rutas:");
        for (String ciudad : mapa.keySet()) {
            System.out.println("  " + ciudad + " → " + mapa.get(ciudad));
        }
    }

    // Método principal de prueba
    public static void main(String[] args) {
        GrafoCiudades grafo = new GrafoCiudades();

        grafo.agregarCiudad("A");
        grafo.agregarCiudad("B");
        grafo.agregarCiudad("C");

        grafo.conectar("A", "B");
        grafo.conectar("A", "C");
        grafo.conectar("B", "C");

        grafo.mostrar();
    }
}


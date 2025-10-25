import java.util.HashMap;

public class UsuariosHash {
    HashMap<String, String> usuarios = new HashMap<>();

    public void agregar(String id, String nombre) {
        if (!usuarios.containsKey(id)) {
            usuarios.put(id, nombre);
        } else {
            System.out.println("ID repetido: " + id);
        }
    }

    public void mostrar() {
        System.out.println("Usuarios registrados: " + usuarios);
    }

    public static void main(String[] args) {
        UsuariosHash h = new UsuariosHash();
        h.agregar("101", "Juan");
        h.agregar("102", "Maria");
        h.agregar("101", "Pedro");
        h.mostrar();
    }
}

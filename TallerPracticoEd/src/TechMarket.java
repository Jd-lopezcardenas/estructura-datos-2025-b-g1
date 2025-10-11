import java.util.ArrayList;
import java.util.Scanner;

public class TechMarket {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Estructura dinámica para los productos
        ArrayList<String> listaProductos = new ArrayList<>();

        // Vector fijo de categorías
        String[] categorias = {"Tecnología", "Hogar", "Aseo", "Bebidas", "Snacks"};

        int opcion = -1; // inicialización por defecto

        do {
            // Menú principal
            System.out.println("\n========= SISTEMA TECHMARKET =========");
            System.out.println("1. Registrar producto");
            System.out.println("2. Ver lista de productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Ver categorías disponibles");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            // Validación básica de entrada numérica
            while (!entrada.hasNextInt()) {
                System.out.println(" Opción inválida. Ingrese un número.");
                entrada.next(); // limpiar entrada no numérica
                System.out.print("Seleccione una opción: ");
            }
            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del nuevo producto: ");
                    String producto = entrada.nextLine().trim();

                    if (producto.isEmpty()) {
                        System.out.println(" El nombre del producto no puede estar vacío.");
                    } else if (listaProductos.contains(producto)) {
                        System.out.println(" Este producto ya está registrado.");
                    } else {
                        listaProductos.add(producto);
                        System.out.println(" Producto '" + producto + "' agregado correctamente.");
                    }
                    break;

                case 2:
                    System.out.println("\n PRODUCTOS EN INVENTARIO:");
                    if (listaProductos.isEmpty()) {
                        System.out.println("No hay productos registrados todavía.");
                    } else {
                        int contador = 1;
                        for (String prod : listaProductos) {
                            System.out.println(contador + ". " + prod);
                            contador++;
                        }
                    }
                    break;

                case 3:
                    if (listaProductos.isEmpty()) {
                        System.out.println("No hay productos para eliminar.");
                        break;
                    }
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String eliminar = entrada.nextLine().trim();

                    if (listaProductos.remove(eliminar)) {
                        System.out.println(" Producto '" + eliminar + "' eliminado con éxito.");
                    } else {
                        System.out.println(" No se encontró el producto '" + eliminar + "'.");
                    }
                    break;

                case 4:
                    System.out.println("\n CATEGORÍAS DISPONIBLES:");
                    for (int i = 0; i < categorias.length; i++) {
                        System.out.println((i + 1) + ". " + categorias[i]);
                    }
                    break;

                case 0:
                    System.out.println(" Gracias por usar TechMarket. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println(" Opción fuera de rango. Intente nuevamente.");
            }

        } while (opcion != 0);

        entrada.close();
    }
}

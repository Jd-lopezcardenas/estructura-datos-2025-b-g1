public class MainDemo {
    public static void main(String[] args) {
        System.out.println("-- PILA --");
        EditorStack.main(null);

        System.out.println("\n-- COLA CON PRIORIDAD --");
        SistemaAtencion.main(null);

        System.out.println("\n-- HASHMAP --");
        UsuariosHash.main(null);

        System.out.println("\n-- ÁRBOL BINARIO --");
        ArbolBinario.main(null);

        System.out.println("\n-- ÁRBOL AVL --");
        ArbolAVL.main(null);  // 🔹 Llamamos la clase AVL

        System.out.println("\n-- BST (BÚSQUEDA, INSERCIÓN Y ELIMINACIÓN) --");
        BST.main(null);       // 🔹 Llamamos la clase BST

        System.out.println("\n-- GRAFO --");
        GrafoCiudades.main(null);

        System.out.println("\n-- COMPLEJIDAD --");
        Complejidad.main(null);
    }
}

public class BST {

    class Nodo {
        int valor;
        Nodo izq, der;

        Nodo(int v) {
            valor = v;
        }
    }

    private Nodo raiz;

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private Nodo insertarRec(Nodo n, int valor) {
        if (n == null) return new Nodo(valor);
        if (valor < n.valor) n.izq = insertarRec(n.izq, valor);
        else if (valor > n.valor) n.der = insertarRec(n.der, valor);
        return n;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Nodo n, int valor) {
        if (n == null) return false;
        if (n.valor == valor) return true;
        return (valor < n.valor) ? buscarRec(n.izq, valor) : buscarRec(n.der, valor);
    }

    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private Nodo eliminarRec(Nodo n, int valor) {
        if (n == null) return null;
        if (valor < n.valor) n.izq = eliminarRec(n.izq, valor);
        else if (valor > n.valor) n.der = eliminarRec(n.der, valor);
        else {
            if (n.izq == null) return n.der;
            else if (n.der == null) return n.izq;

            n.valor = minValor(n.der);
            n.der = eliminarRec(n.der, n.valor);
        }
        return n;
    }

    private int minValor(Nodo n) {
        int minv = n.valor;
        while (n.izq != null) {
            minv = n.izq.valor;
            n = n.izq;
        }
        return minv;
    }

    public static void main(String[] args) {
        BST bst = new BST();
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int v : valores) bst.insertar(v);

        System.out.println("Buscar 40: " + bst.buscar(40));
        bst.eliminar(30);
        System.out.println("Buscar 30 después de eliminar: " + bst.buscar(30));
    }
}

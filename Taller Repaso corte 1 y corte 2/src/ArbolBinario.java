import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {
    class Nodo {
        int valor;
        Nodo izq, der;
        Nodo(int v) { valor = v; }
    }

    Nodo raiz;

    public void insertar(int v) {
        raiz = insertarRec(raiz, v);
    }

    private Nodo insertarRec(Nodo n, int v) {
        if (n == null) return new Nodo(v);
        if (v < n.valor) n.izq = insertarRec(n.izq, v);
        else n.der = insertarRec(n.der, v);
        return n;
    }

    public void inorden(Nodo n) {
        if (n == null) return;
        inorden(n.izq);
        System.out.print(n.valor + " ");
        inorden(n.der);
    }

    public static void main(String[] args) {
        ArbolBinario a = new ArbolBinario();
        int[] nums = {50, 30, 70, 20, 40};
        for (int n : nums) a.insertar(n);
        System.out.print("Recorrido inorden: ");
        a.inorden(a.raiz);
    }
}

public class ArbolAVL {

    class Nodo {
        int valor, altura;
        Nodo izq, der;

        Nodo(int v) {
            valor = v;
            altura = 1;
        }
    }

    private Nodo raiz;

    private int altura(Nodo n) {
        return (n == null) ? 0 : n.altura;
    }

    private int factorBalance(Nodo n) {
        return (n == null) ? 0 : altura(n.izq) - altura(n.der);
    }

    private Nodo rotarDerecha(Nodo y) {
        Nodo x = y.izq;
        Nodo t2 = x.der;

        x.der = y;
        y.izq = t2;

        y.altura = Math.max(altura(y.izq), altura(y.der)) + 1;
        x.altura = Math.max(altura(x.izq), altura(x.der)) + 1;

        System.out.println("Rotación simple a la derecha");
        return x;
    }

    private Nodo rotarIzquierda(Nodo x) {
        Nodo y = x.der;
        Nodo t2 = y.izq;

        y.izq = x;
        x.der = t2;

        x.altura = Math.max(altura(x.izq), altura(x.der)) + 1;
        y.altura = Math.max(altura(y.izq), altura(y.der)) + 1;

        System.out.println("Rotación simple a la izquierda");
        return y;
    }

    private Nodo insertarRec(Nodo n, int valor) {
        if (n == null) return new Nodo(valor);

        if (valor < n.valor) n.izq = insertarRec(n.izq, valor);
        else if (valor > n.valor) n.der = insertarRec(n.der, valor);
        else return n;

        n.altura = 1 + Math.max(altura(n.izq), altura(n.der));
        int balance = factorBalance(n);

        if (balance > 1 && valor < n.izq.valor) return rotarDerecha(n);
        if (balance < -1 && valor > n.der.valor) return rotarIzquierda(n);
        if (balance > 1 && valor > n.izq.valor) {
            n.izq = rotarIzquierda(n.izq);
            System.out.println("Rotación doble izquierda-derecha");
            return rotarDerecha(n);
        }
        if (balance < -1 && valor < n.der.valor) {
            n.der = rotarDerecha(n.der);
            System.out.println("Rotación doble derecha-izquierda");
            return rotarIzquierda(n);
        }

        return n;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    public void inorden(Nodo n) {
        if (n != null) {
            inorden(n.izq);
            System.out.print(n.valor + " ");
            inorden(n.der);
        }
    }

    public static void main(String[] args) {
        ArbolAVL avl = new ArbolAVL();
        int[] valores = {10, 20, 30, 40, 50, 25};
        for (int v : valores) avl.insertar(v);
        System.out.print("Recorrido inorden: ");
        avl.inorden(avl.raiz);
    }
}

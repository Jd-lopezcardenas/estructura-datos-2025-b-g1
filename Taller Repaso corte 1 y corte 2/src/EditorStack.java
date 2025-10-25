import java.util.Stack;

public class EditorStack {
    private Stack<String> undo;
    private Stack<String> redo;
    private String texto;

    public EditorStack() {
        undo = new Stack<>();
        redo = new Stack<>();
        texto = "";
    }

    public void escribir(String t) {
        undo.push(texto);
        texto += t;
        redo.clear();
    }

    public void deshacer() {
        if (!undo.isEmpty()) {
            redo.push(texto);
            texto = undo.pop();
        }
    }

    public void rehacer() {
        if (!redo.isEmpty()) {
            undo.push(texto);
            texto = redo.pop();
        }
    }

    public String getTexto() {
        return texto;
    }

    public static void main(String[] args) {
        EditorStack e = new EditorStack();
        e.escribir("Hola ");
        e.escribir("mundo");
        System.out.println("Texto actual: " + e.getTexto());
        e.deshacer();
        System.out.println("Después de deshacer: " + e.getTexto());
        e.rehacer();
        System.out.println("Después de rehacer: " + e.getTexto());
    }
}

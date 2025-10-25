import java.util.PriorityQueue;

class Paciente implements Comparable<Paciente> {
    String nombre;
    int prioridad; // menor número = más urgente

    Paciente(String n, int p) {
        nombre = n;
        prioridad = p;
    }

    public int compareTo(Paciente otro) {
        return Integer.compare(prioridad, otro.prioridad);
    }

    public String toString() {
        return nombre + " (prioridad " + prioridad + ")";
    }
}

public class SistemaAtencion {
    PriorityQueue<Paciente> cola = new PriorityQueue<>();

    public void agregar(String nombre, int prioridad) {
        cola.add(new Paciente(nombre, prioridad));
    }

    public Paciente atender() {
        return cola.poll();
    }

    public static void main(String[] args) {
        SistemaAtencion s = new SistemaAtencion();
        s.agregar("Luis", 2);
        s.agregar("Ana", 1);
        s.agregar("Carlos", 3);

        System.out.println("Atendiendo: " + s.atender());
        System.out.println("Atendiendo: " + s.atender());
    }
}

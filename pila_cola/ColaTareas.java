public class ColaTareas {
    private final int tamMax;
    private Tarea[] arregloCola;
    private int frente;
    private int fin;
    private int numElementos;

    public ColaTareas(int tam) {
        this.tamMax = tam;
        this.arregloCola = new Tarea[tamMax];
        this.frente = 0;
        this.fin = -1;
        this.numElementos = 0;
    }

    public void encolar(Tarea tarea) {
        if (!estaLlena()) {
            if (fin == tamMax - 1) {
                fin = -1;
            }
            arregloCola[++fin] = tarea;
            numElementos++;
        } else {
            System.out.println("La cola está llena. No se puede agregar la tarea.");
        }
    }

    public Tarea desencolar() {
        if (!estaVacia()) {
            Tarea temp = arregloCola[frente++];
            if (frente == tamMax) {
                frente = 0;
            }
            numElementos--;
            return temp;
        }
        System.out.println("La cola está vacía.");
        return null;
    }

    public boolean estaVacia() {
        return (numElementos == 0);
    }

    public boolean estaLlena() {
        return (numElementos == tamMax);
    }
}

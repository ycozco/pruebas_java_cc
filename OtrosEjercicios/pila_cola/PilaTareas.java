public class PilaTareas {
    private final int maxSize;
    private Tarea[] stackArray;
    private int top;

    public PilaTareas(int size) {
        this.maxSize = size;
        this.stackArray = new Tarea[maxSize];
        this.top = -1;
    }

    public void push(Tarea tarea) {
        if (!isFull()) {
            stackArray[++top] = tarea;
        } else {
            System.out.println("La pila está llena. No se puede agregar la tarea.");
        }
    }

    public Tarea pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        }
        System.out.println("La pila está vacía.");
        return null;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

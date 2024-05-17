public class ColaTareas {
    // Arreglo para almacenar los elementos de la cola.
    private Tarea[] tareas;
    // Índice del primer elemento de la cola.
    private int front;
    // Índice donde se insertará el próximo elemento.
    private int rear;
    // Número de elementos en la cola.
    private int nItems;
    // Capacidad máxima de la cola.
    private int maxSize;

    // Constructor de la cola.
    public ColaTareas(int size) {
        maxSize = size;
        tareas = new Tarea[maxSize];
        front = 0;  // La cola comienza vacía, el frente está en la posición 0.
        rear = -1;  // La cola está vacía, así que rear se inicializa en -1.
        nItems = 0; // Inicialmente, no hay elementos en la cola.
    }

    // Método para añadir elementos a la cola.
    public void enqueue(Tarea tarea) {
        if (isFull()) {
            System.out.println("La cola está llena. No se puede agregar la tarea.");
            return;
        }
        
        // Avanza rear circularmente.
        rear = (rear + 1) % maxSize;
        tareas[rear] = tarea; // Inserta el nuevo elemento en la posición rear.
        nItems++; // Incrementa el contador de elementos.
    }

    // Método para quitar y retornar el elemento frente de la cola.
    public Tarea dequeue() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return null;
        }
        
        Tarea tarea = tareas[front]; // Obtiene el elemento al frente.
        front = (front + 1) % maxSize; // Avanza front circularmente.
        nItems--; // Decrementa el contador de elementos.
        return tarea; // Retorna el elemento quitado.
    }

    // Método para verificar si la cola está vacía.
    public boolean isEmpty() {
        return nItems == 0;
    }
    
    // Método para verificar si la cola está llena.
    public boolean isFull() {
        return nItems == maxSize;
    }
}

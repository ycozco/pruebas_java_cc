public class ColaTareas {
    private final int maxSize;
    private Tarea[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public ColaTareas(int size) {
        this.maxSize = size;
        this.queueArray = new Tarea[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void enqueue(Tarea tarea) {
        if (!isFull()) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = tarea;
            nItems++;
        } else {
            System.out.println("La cola está llena. No se puede agregar la tarea.");
        }
    }

    public Tarea dequeue() {
        if (!isEmpty()) {
            Tarea temp = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
        System.out.println("La cola está vacía.");
        return null;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }
}

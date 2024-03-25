public class GestorTareas {
    private PilaTareas tareasCompletadas;
    private ColaTareas tareasPendientes;

    public GestorTareas(int size) {
        tareasCompletadas = new PilaTareas(size);
        tareasPendientes = new ColaTareas(size);
    }

    public void agregarTareaPendiente(Tarea tarea) {
        tareasPendientes.enqueue(tarea);
    }

    public void completarTarea() {
        Tarea tarea = tareasPendientes.dequeue();
        if (tarea != null) {
            tareasCompletadas.push(tarea);
            System.out.println("Tarea completada: " + tarea);
        }
    }

    public void mostrarTareasPendientes() {
        System.out.println("Tareas Pendientes:");
        while (!tareasPendientes.isEmpty()) {
            System.out.println(tareasPendientes.dequeue());
        }
    }

    public void mostrarTareasCompletadas() {
        System.out.println("Tareas Completadas:");
        while (!tareasCompletadas.isEmpty()) {
            System.out.println(tareasCompletadas.pop());
        }
    }
}

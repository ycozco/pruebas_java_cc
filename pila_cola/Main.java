public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas(10);

        gestor.agregarTareaPendiente(new Tarea(1, "Aprender estructuras de datos"));
        gestor.agregarTareaPendiente(new Tarea(2, "Implementar pila en Java"));
        gestor.agregarTareaPendiente(new Tarea(3, "Implementar cola en Java"));
        gestor.agregarTareaPendiente(new Tarea(4, "Estudiar para el examen de matemáticas"));

        // Mostrar tareas pendientes antes de completar alguna
        System.out.println("Antes de completar tareas:");
        gestor.mostrarTareasPendientes();

        // Completar algunas tareas
        gestor.completarTarea();
        gestor.completarTarea();

        // Intentar mostrar tareas pendientes nuevamente (Nota: la implementación vacía la cola)
        System.out.println("\nDespués de completar tareas, pendientes:");
        gestor.mostrarTareasPendientes();

        // Mostrar tareas completadas
        System.out.println("\nTareas completadas:");
        gestor.mostrarTareasCompletadas();
    }
}

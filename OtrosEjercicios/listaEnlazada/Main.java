public class Main {
    public static void main(String[] args) {
        ListaContactos lista = new ListaContactos();
        
        // Agregando contactos
        lista.agregarContacto(new Contacto("Juan", "Pérez", "123456789", "juan.perez@example.com"));
        lista.agregarContacto(new Contacto("Ana", "García", "987654321", "ana.garcia@example.com"));
        
        System.out.println("Lista de contactos después de agregar:");
        lista.mostrarContactos();
        
        // Buscando un contacto
        System.out.println("\nBuscando a Juan Pérez:");
        Contacto buscado = lista.buscarContacto("Juan", "Pérez");
        if (buscado != null) {
            System.out.println("Contacto encontrado: " + buscado);
        } else {
            System.out.println("Contacto no encontrado.");
        }
        
        // Eliminando un contacto
        System.out.println("\nEliminando a Juan Pérez.");
        lista.eliminarContacto("Juan", "Pérez");
        
        System.out.println("\nLista de contactos después de eliminar:");
        lista.mostrarContactos();
    }
}

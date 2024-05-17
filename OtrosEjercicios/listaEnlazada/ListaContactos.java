class ListaContactos {
    private Nodo cabeza = null;

    public void agregarContacto(Contacto contacto) {
        Nodo nuevoNodo = new Nodo(contacto);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    public boolean eliminarContacto(String nombre, String apellido) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.contacto.getNombre().equals(nombre) && cabeza.contacto.getApellido().equals(apellido)) {
            cabeza = cabeza.siguiente;
            return true;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.contacto.getNombre().equals(nombre) && actual.siguiente.contacto.getApellido().equals(apellido)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public Contacto buscarContacto(String nombre, String apellido) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.contacto.getNombre().equals(nombre) && temp.contacto.getApellido().equals(apellido)) {
                return temp.contacto;
            }
            temp = temp.siguiente;
        }
        return null;
    }

    public void mostrarContactos() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println(temp.contacto);
            temp = temp.siguiente;
        }
    }
}

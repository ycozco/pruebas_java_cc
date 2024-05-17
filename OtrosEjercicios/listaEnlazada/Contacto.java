public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Contacto(String nombre, String apellido, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - Teléfono: " + telefono + ", Email: " + email;
    }
}

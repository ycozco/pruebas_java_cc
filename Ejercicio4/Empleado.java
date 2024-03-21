package Ejercicio4;

public abstract class Empleado {
    private String nombre;
    private String ID;
    private double salario;

    public Empleado (String nombre, String ID, double salario){
        this.nombre = nombre;
        this.ID = ID;
        this.salario = salario;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void obtenerInformacion () {
        System.out.println("Nombre: " + nombre + "\t ID: " + ID + "\t Salario: " + salario);
    }

    public abstract double calcularBono();
}

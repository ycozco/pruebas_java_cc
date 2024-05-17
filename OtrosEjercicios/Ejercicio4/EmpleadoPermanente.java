package Ejercicio4;

public class EmpleadoPermanente extends Empleado {
    private int aniosServicio;

    public EmpleadoPermanente (String nombre, String ID, double salario, int aniosServicio) {
        super(nombre, ID, salario);
        this.aniosServicio = aniosServicio;
    }
    
    @Override
    public double calcularBono(){
        return aniosServicio*100;
    }

}
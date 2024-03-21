package Ejercicio4;

public class EmpleadoPorContrato extends Empleado {
    private int duracionContrato;

    public EmpleadoPorContrato (String nombre, String ID, double salario, int duracionContrato) {
        super(nombre, ID, salario);
        this.duracionContrato = duracionContrato;
    }

    @Override
    public double calcularBono(){
        return duracionContrato*50;
    }
}
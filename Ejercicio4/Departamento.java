package Ejercicio4;

import java.util.ArrayList;

public class Departamento implements Gestionable{
    private String nombre;
    private ArrayList <Empleado> empleados = new ArrayList<>();

    public Departamento (String nombre){
        this.nombre = nombre;

    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public void eliminarEmpleado(String ID) {
        for (Empleado empleado : empleados) {
            if(empleado.getID().equals(ID)) {
                empleados.remove(empleado);
                break;
            }
        }
    }

    public void listarEmpleados() {
        if(empleados.isEmpty()){
            System.out.println("El departamento de " + nombre + " no tiene empleados asignados.");
        } else {
            System.out.println("Empleados del departamento " + nombre + ": ");
            for (Empleado empleado : empleados) {
                empleado.obtenerInformacion();
            }
        }

    }

}

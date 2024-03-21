package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        EmpleadoPermanente empleadoP1 = new EmpleadoPermanente("Juan", "001", 1000, 5);
        EmpleadoPorContrato empleadoC1 = new EmpleadoPorContrato("Pedro", "005", 1200, 4);
        EmpleadoPermanente empleadoP2 = new EmpleadoPermanente("Luis", "006", 2000, 3);
        EmpleadoPorContrato empleadoC2 = new EmpleadoPorContrato("Roger","002", 1700, 2);

        Departamento ventas = new Departamento("Ventas");
        Departamento marketing = new Departamento("Marketing");
        marketing.agregarEmpleado(empleadoC1);
        ventas.agregarEmpleado(empleadoP1);
        marketing.agregarEmpleado(empleadoC2);
        marketing.agregarEmpleado(empleadoP2);

        ventas.listarEmpleados();
        marketing.listarEmpleados();

        ventas.eliminarEmpleado("001");

        ventas.listarEmpleados();
        marketing.listarEmpleados();

        System.out.println("El empleado " + empleadoC1.getNombre() + " recibe un bono de " + empleadoC1.calcularBono());
        System.out.println("El empleado " + empleadoP2.getNombre() + " recibe un bono de " + empleadoP2.calcularBono());

    }
}

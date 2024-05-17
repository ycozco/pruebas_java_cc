package Ejercicio5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HabitacionEstandar habitacionEstandar = new HabitacionEstandar(101, 100, true);
        HabitacionEstandar habitacionEstandar2 = new HabitacionEstandar(102, 100, true);
        HabitacionSuite habitacionSuite = new HabitacionSuite(201, 200, true);
        HabitacionSuite habitacionSuite2 = new HabitacionSuite(202, 200, true);
        HabitacionDeluxe habitacionDeluxe = new HabitacionDeluxe(301, 300, true);
        HabitacionDeluxe habitacionDeluxe2 = new HabitacionDeluxe(302, 300, true);

        ArrayList <Habitacion> habitaciones = new ArrayList<>();
        HashMap<Integer, Reserva> listaReservas = new HashMap<>();

        habitaciones.add(habitacionEstandar);
        habitaciones.add(habitacionEstandar2);
        habitaciones.add(habitacionSuite);
        habitaciones.add(habitacionSuite2);
        habitaciones.add(habitacionDeluxe);
        habitaciones.add(habitacionDeluxe2);
        int opcion;
        int iReserva = 1;
        do {
            System.out.println("Menú Principal");
            System.out.println("1. Hacer una Reserva");
            System.out.println("2. Agregar servicios adicionales");
            System.out.println("3. Mostrar detalles de la reserva");
            System.out.println("0. Salir del programa");
            System.out.print("\nSeleccione una opción(1/2/3/0): ");
            opcion = sc.nextInt();
            
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Haciendo una reserva:");
                    System.out.println("\nHabitaciones: ");
                    for (Habitacion habitacion : habitaciones) {
                        habitacion.obtenerInformacion();
                        System.out.println("");
                    }
                   
                    System.out.println("Ingresar datos (Ejm: Nombre, Tipo de habitacion (Primera letra en mayuscula), Duración de la estadia (1-10) en días): ");
                    String respuesta = sc.nextLine();
                    String[] pRespuesta = respuesta.split(", "); //Está dividiendo la cadena usando ", " como delimitador
                    String nombre = pRespuesta[0];
                    int duracion = Integer.parseInt(pRespuesta[2]);
                    pRespuesta[1] = pRespuesta[1].toLowerCase();

                    if ((pRespuesta[1].equals("estandar") || pRespuesta[1].equals("deluxe")
                            || pRespuesta[1].equals("suite")) && (duracion > 0 && duracion < 11)) {
                        String tipo = pRespuesta[1];

                        System.out.println("Habitacion(es) " + pRespuesta[1] + " disponibles:");

                        ArrayList<Habitacion> escogerH = new ArrayList<>();
                        for (Habitacion habitacion : habitaciones) {
                            if (tipo.equals(habitacion.getTipo().toLowerCase()) && habitacion.getDisponible()) {
                                escogerH.add(habitacion);
                                System.out.println(habitacion.getNumeroHabitacion() + "\t");
                            }
                        }
                        System.out.println("Ingrese número de la habitación a reservar: ");
                        int numReserva = sc.nextInt();
                        for (Habitacion opciones : escogerH) {
                            if (numReserva == opciones.getNumeroHabitacion() && opciones.getDisponible()) {
                                Reserva reserva = new Reserva(nombre, opciones, duracion);
                                opciones.setDisponible(false);
                                listaReservas.put(iReserva, reserva);
                                System.out.println("La habitacion N° " + opciones.getNumeroHabitacion()
                                        + " fue reservada exitosamente");
                                break;
                            } else {
                                System.out.println("Habitacion no existente o ocupada");
                                break;
                            }
                        }
                        iReserva++;
                        System.out.print(
                                "Operacion Finalizada. Desea volver al menu principal? (Cualquier numero para continuar / 0 para salir): ");
                        opcion = sc.nextInt();
                        break;
                    } else {
                        System.out.println("Datos incorrectos ingresados. Intente de nuevo.");
                        break;
                    }

                case 2:
                    System.out.println("Listando todas las reservas: \n");
                    for (Map.Entry<Integer, Reserva> entry : listaReservas.entrySet()) {
                        int numeroReserva = entry.getKey();
                        Reserva reserva = entry.getValue();
                        System.out.println("Numero de reserva: " + numeroReserva + "\t Cliente: " + reserva.getCliente() + "\t N° habitacion: " + reserva.getHabitacion().getNumeroHabitacion() + "\t Precio actual: " + reserva.calcularCostoTotal() + "\n");
                        //reserva.mostrarDetalles();
                    }
                    System.out.print("Ingrese num de reserva para agregar servicios adicionales: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    Reserva reservaS = listaReservas.get(num);
                    if (reservaS != null) {
                        System.out.print(reservaS.getCliente() + ", ¿qué servicio adicional desea agregar? (SPA/DESAYUNO/TRANSPORTE): ");
                        String servicio = sc.nextLine().toLowerCase();
                        switch (servicio) {
                            case "spa":
                                reservaS.agregarServicioAdicional(ServicioAdicional.SPA, 50);
                                System.out.println("Agregó SPA +$50 \n");
                                break;
                            case "desayuno":
                                reservaS.agregarServicioAdicional(ServicioAdicional.DESAYUNO, 30);
                                System.out.println("Agregó DESAYUNO +$30 \n");
                                break;
                            case "transporte":
                                reservaS.agregarServicioAdicional(ServicioAdicional.TRANSPORTE, 100);
                                System.out.println("Agregó TRANSPORTE +$100 \n");
                                break;
                            default:
                                System.out.println("Servicio no existente");
                                break;
                        }
                    } else {
                        System.out.println("No se encontró ninguna reserva con el número especificado.");
                    }
                    System.out.print("Operacion Finalizada. Desea volver al menu principal? (Cualquier numero para continuar / 0 para salir): ");
                    opcion = sc.nextInt();
                    break;

                    case 3: 
                    System.out.println("Listando todas las reservas: \n");
                    for (Map.Entry<Integer, Reserva> entry : listaReservas.entrySet()) {
                        int numeroReserva = entry.getKey();
                        Reserva reserva = entry.getValue();
                        System.out.println("Numero de reserva: " + numeroReserva + "\t Cliente: " + reserva.getCliente() + "\t N° habitacion: " + reserva.getHabitacion().getNumeroHabitacion() + "\t Precio actual: " + reserva.calcularCostoTotal() + "\n");
                    }
                    System.out.print("Ingrese num de reserva para MOSTRAR DATOS COMPLETOS: ");
                    int num1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");
                    Reserva reservaDetalle = listaReservas.get(num1);
                    if (reservaDetalle != null) {
                    reservaDetalle.mostrarDetalles();
                    } else {
                        System.out.println("No se encontró ninguna reserva con el número especificado.");
                    }
                    System.out.print("Operacion Finalizada. Desea volver al menu principal? (Cualquier numero para continuar / 0 para salir): ");
                    opcion = sc.nextInt();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }

        } while (opcion != 0);

        // Reserva reserva1 = new Reserva("Mario", habitacionDeluxe, 3);
        // reserva1.mostrarDetalles();
        // reserva1.agregarServicioAdicional(ServicioAdicional.SPA, 50);
        // reserva1.mostrarDetalles();

    }
}


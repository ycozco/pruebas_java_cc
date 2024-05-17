public class Main {

    public static void main(String[] args) {

        Automovil auto = new Automovil("ABC123", "Rojo", "Toyota Corolla", 4);
        auto.acelerar();
        auto.frenar();
        auto.cambiarVelocidad();
        auto.abrirPuertas();
        auto.cerrarPuertas();

        Camion camion = new Camion("DEF456", "Azul", "Nissan NP300", 5000);
        camion.acelerar();
        camion.frenar();
        camion.cambiarVelocidad();
        camion.cargar();
        camion.descargar();

        Motocicleta moto = new Motocicleta("GHI789", "Negra", "Honda CBR600RR", 600);
        moto.acelerar();
        moto.frenar();
        moto.cambiarVelocidad();
    }
    
}

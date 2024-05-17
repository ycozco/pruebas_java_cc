package Ejercicio2;

public class Main {
    public static void main(String[] args) {

     //   public CocheDeportivo (String modelo, String marca, int anio, int velocidadActual, boolean encendido, String tipo){
        CocheDeportivo deportivo = new CocheDeportivo("Bugatti", "Veyron", 2023, 450, true, "GT");
        CocheFamiliar familiar = new CocheFamiliar("Audi", "Familia", 2020, 300, false, 6);
        CocheElectrico electrico = new CocheElectrico("Tesla" , "3", 2000, 250, true, 500);

        deportivo.obtenerInformacion();
        familiar.obtenerInformacion();
        electrico.obtenerInformacion();
        electrico.recargarBateria();
    }
}

package Ejercicio2;

public class Coche {
    private String modelo;
    private String marca;
    private int anio;
    private int velocidadActual;
    private boolean encendido;

    public Coche (String modelo, String marca, int anio, int velocidadActual, boolean encendido){
        this.modelo = modelo;
        this.marca = marca;
        this.anio = anio;
        this.velocidadActual = velocidadActual;
        this.encendido = encendido;
    }

    public void obtenerInformacion(){
        System.out.println("Modelo: " + modelo + "\t Marca:" + marca + "\t Año: " + anio + "\t Velocidad Actual" + velocidadActual + "\t Encendido: " + (encendido?"Sí":"No"));
    }

}

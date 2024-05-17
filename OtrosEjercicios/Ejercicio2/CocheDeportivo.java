package Ejercicio2;

public class CocheDeportivo extends Coche{
    private String tipo;

    public CocheDeportivo (String modelo, String marca, int anio, int velocidadActual, boolean encendido, String tipo){
        super(modelo, marca, anio, velocidadActual, encendido);
        this.tipo = tipo;
    }

    @Override
    public void obtenerInformacion(){
        super.obtenerInformacion();
        System.out.println("Tipo: " + tipo);

    }
}

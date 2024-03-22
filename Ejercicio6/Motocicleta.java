package Ejercicio6;

public class Motocicleta extends Vehiculo{
    private int cilindrada;

    public Motocicleta (String placa, String marca, int anio, Motor motor, int cilindrada){
        super(placa, marca, anio, motor);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
}

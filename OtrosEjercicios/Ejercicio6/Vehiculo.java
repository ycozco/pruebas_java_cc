package Ejercicio6;

public class Vehiculo {
    private String placa;
    private String marca;
    private int anio;
    private Motor motor;

    public Vehiculo (String placa, String marca, int anio, Motor motor){
        this.placa = placa;
        this.marca = marca;
        this.anio = anio;
        this.motor = motor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }



}

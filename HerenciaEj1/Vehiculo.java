

public class Vehiculo { // Clase que representa un vehículo genérico

    private String numeroPlacas; // Número de placas del vehículo
    private String color; // Color del vehículo
    public String modelo; // Modelo del vehículo

    public Vehiculo(String numeroPlacas, String color, String modelo) { // Constructor de la clase
        this.numeroPlacas = numeroPlacas;
        this.color = color;
        this.modelo = modelo;
    }

    public void acelerar() { // Método para acelerar el vehículo
        System.out.println(this.modelo + " está acelerando.");
    }

    public void frenar() { // Método para frenar el vehículo
        System.out.println(this.modelo + " está frenando.");
    }

    public void cambiarVelocidad() { // Método para cambiar la velocidad del vehículo
        System.out.println(this.modelo + " está cambiando de velocidad.");
    }

    public String getNumeroPlacas() { // Getter para obtener el número de placas
        return numeroPlacas;
    }

    public void setNumeroPlacas(String numeroPlacas) { // Setter para establecer el número de placas
        this.numeroPlacas = numeroPlacas;
    }

    public String getColor() { // Getter para obtener el color
        return color;
    }

    public void setColor(String color) { // Setter para establecer el color
        this.color = color;
    }

    public String getModelo() { // Getter para obtener el modelo
        return modelo;
    }

    public void setModelo(String modelo) { // Setter para establecer el modelo
        this.modelo = modelo;
    }
}
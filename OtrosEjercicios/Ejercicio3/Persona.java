package Ejercicio3;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public Persona(){
        this("desconocido", 0, 0.0);
    
    }

    public Persona (String nombre, int edad, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public boolean verificarEdad(){
        return edad>=18;
    }


    @Override
    public String toString(){
        return "Nombre: " + nombre + "\t Edad: " + edad + "\t Altura: " + altura + "\t Es mayor de edad? " + (edad>=18?"Sí":"No"); 
    }


    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Marta", 20, 1.60);
        System.out.println(persona1);
        System.out.println(persona2);

        System.out.println("Nombre: " + persona2.getNombre());
        persona2.setNombre("Fatima");
        System.out.println("Nombre: " + persona2.getNombre());

        if(persona2.verificarEdad()){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.println(persona2.getNombre()+(persona2.verificarEdad()?" es mayor de edad":" no es mayor de edad"));
    }
}

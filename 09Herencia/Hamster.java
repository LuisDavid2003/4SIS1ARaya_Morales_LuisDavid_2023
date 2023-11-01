public class Hamster extends Animal {
    //Hereda todas las características de la clase padre, en este caso Animal
    
    public Hamster() {
    }

    //Sobrecarga
    public Hamster(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
        
    }


   

    public void mostrarHamster(){
        System.out.println("El nombre del hamster es: " + getNombre() + "\n"
                            + "La raza es: " + getRaza() + "\n"
                            + "Se alimenta de: " + getTipo_Alimento() + "\n"
                            + "El hamster tiene la edad de: " + getEdad() + "\n");
                           
    }
}
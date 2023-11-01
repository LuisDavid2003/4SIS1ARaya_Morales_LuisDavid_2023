public class Cuyo extends Animal {
    //Hereda todas las características de la clase padre, en este caso Animal
    
    public Cuyo() {
    }

    
    public Cuyo(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
        
    }

    

    public void mostrarCuyo(){
        System.out.println("El nombre del cuyo es: " + getNombre() + "\n"
                            + "La raza es: " + getRaza() + "\n"
                            + "Se alimenta de: " + getTipo_Alimento() + "\n"
                            + "El cuyo tiene la edad de: " + getEdad() + "\n");
                            //+ "Las vidas del michi son: " + num_vidas + "\n");
    }
}

public class Huron extends Animal {
    //Hereda todas las características de la clase padre, en este caso Animal
    
    public Huron() {
    }

    //Sobrecarga
    public Huron(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
        
    }

    public void mostrarHuron(){
        System.out.println("El nombre del huron es: " + getNombre() + "\n"
                            + "La raza es: " + getRaza() + "\n"
                            + "Se alimenta de: " + getTipo_Alimento() + "\n"
                            + "El huron tiene la edad de: " + getEdad() + "\n");
                            
    }
}

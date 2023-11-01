public class Perro extends Animal {
    //Hereda todas las características de la clase padre, en este caso Animal
    public Perro() {
    }

    //Sobrecarga
    public Perro(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
       
    }

    public void mostrarPerro(){
        System.out.println("El nombre del perritu es: " + getNombre() + "\n"
                            + "La raza es: " + getRaza() + "\n"
                            + "Se alimenta de: " + getTipo_Alimento() + "\n"
                            + "El perritu tiene la edad de: " + getEdad() + "\n");
                           
    }
}

/*
Vamos a crear un programa en el cual debemos tener un menu de seleccion
para elegir alguna de las siguientes 14 opciones:
1. Bono o descuento por edad
2. Convertir numeros decimales a binarios
3. Convertir temperaturas
4. Numero de positivos y negativos
5. Tiendita
6. Area y perimetro
7. Tabla
8. Factorial
9. Dibujos
10. Figura Hueca
11. Patron
12. Diamante
13. Calculadora
14. Salir
*/

//declarar cuales son las librerias que se van a ocupar
//se debe estructurar el tipo de dato acorde a su entrada
// si es entero obtenerlo como entero, si es char obtenerlo como caracter,
import java.util.Scanner;

class EstructurasControl{

    //metodo principal
    public static void main(String[] args){
        //el manejo de objetos, nos ayuda a poder instancear, (mandando a llamar al objeto)
        //para hacer una instancia, es necesario 1. Identificar el tipo objeto
        // 2. Nombrar al objeto
        // 3. Crear al objeto
        Scanner entrada = new Scanner(System.in);
        //crear una instancia del objeto de la entrada por defect de la computadora 
        //vamos a identificar con Scanner el tipo de dato que se esta instanceando
        //entrada es el objeto que se va a poder identificar si es int, double, flot, etc.


        //es declarar a las variables que se van a utilizar en el programa
        //las variables son de dos tipos globales y locales
        //si la declaro dentro de un metodo es local

        int opcion, numbinario, total, cantidadproducto, num1;
        float precio, resultado = 0, compra = 0;
        String nombreproducto;
        String binario = "";
        char letra;

        do{
            //aqui va todo el programa



            //aqui adentro de preguntar
            System.out.println("Deseas repetir el programa?, escribe s para si");
            letra = entrada.next().charAt(0);

        }while(letra == 's' || letra == 'S');
    }
}
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
            System.out.println("Bienvenido al programa :3 ");
            System.out.println("Elija alguna de las siguientes opciones: ");
            System.out.println("1. Descuento por edad ");
            System.out.println("2. Convertir numero decimal a binario "); //profe
            System.out.println("3. Convertir temperaturas ");
            System.out.println("4. Numeros positivos y negativos ");
            System.out.println("5. Tiendita "); //profe
            System.out.println("6. Area y perimetro ");
            System.out.println("7. Tabla "); //profe
            System.out.println("8. Factorial ");
            System.out.println("9. Dibujo "); //profe
            System.out.println("10. Figura Hueca ");
            System.out.println("11. Patrones de codigo ");
            System.out.println("12. Diamante ");
            System.out.println("13. Calculadora ");
            System.out.println("14. Salir ");

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                    break;
                case 2:
                    //decimal a binario
                    System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    //primero tengo que saber que sea positivo
                    if(numbinario > 0){
                        //se cuantas veces el numero se va a dividir entre 2
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario = "0" + binario;
                        }else{
                            binario = "1" + binario;
                        }
                        numbinario = (int)numbinario/2;
                    }    

                    }else if(numbinario == 0 ){
                        binario = "0" + binario;

                    }else if(numbinario < 0){
                        binario = "No se puede convertir un numero negativo, solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;

                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                default:
                    System.out.println("Por favor; elije una opcion valida");
                    break;
            }        


            //aqui adentro de preguntar
            System.out.println("Deseas repetir el programa?, escribe s para si");
            letra = entrada.next().charAt(0);

        }while(letra == 's' || letra == 'S');
    }
}
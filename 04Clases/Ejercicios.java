//esta clase es la que se encarga de las operaciones de la calculadora y
//tambien tendra opciones para convertir unidades crear cuadritos magicos

import java.util.Scanner;

class Ejercicios{
    //objeto para la entrada de datos
    Scanner entrada = new Scanner(System.in);

    //variables globales
    char op;

    //menu
    public void menu(){
        System.out.println("Ejercicios de la clase POO");
        System.out.println("a. Calculadora");
        System.out.println("b. Conversion de unidades");
        System.out.println("c. Crear cuadro magico");
        System.out.println("d. Desplazamiento de un cuadrito");
        System.out.println("Elija la opcion deseada");

        op = entrada.next().charAt(0);

        switch(op){
            case 'a' :
            //implementacion de metodos
                Ejercicio1();
                break;

            case 'b' :
                Ejercicio2();
                break;

            case 'c' :
                Ejercicio3();
                break;
                
            case 'd' :
                Ejercicio4();
                break;
            default:
                System.out.println("Gracias por jugar :3");        

        }
    }

    public void Ejercicio1(){
        //se le llaman metodos vacios porque no poseen argumentos y no son metodos
        //o funciones que necesiten una entrada o salida de algun tipo de dato

        //calculadora
        double num1 = 0.00, suma = 0.00, multi = 1.00;
        char operacion;

        System.out.println("Selecciona la operacion que deseas realizar:");
        System.out.println("a. Suma y resta");
        System.out.println("b. Multiplicacion");
        System.out.println("c. Division");

        operacion = entrada.next().charAt(0);

        switch(operacion){
            case 'a' :
                //vamos a sumar y restar
                //cuando coloque 0 la operacion termina
                System.out.println("Para detener la suma o resta, ingrese el 0");
                do{
                    
                    System.out.println("Escriba los numeros que desee sumar o restar: ");
                    num1 = entrada.nextDouble();
                    suma += num1;
                    //suma = suma + num1;
                }while(num1 != 0);
                System.out.println("El resultado de la operacion es: " + suma);
                break;

            case 'b' :
            System.out.println("Para detener la multiplicacion, ingrese el 0");
            do{
                System.out.println("Escriba el numero que desee multiplicar: ");
                num1 = entrada.nextDouble();
                if(num1 != 0){
                multi *= num1;
                //multi = multi * num1;
                }

                
            }while(num1 != 0);
            System.out.println("El resultado de la operacion es: " + multi);
                break;

            case 'c' :
                //tareiha
                //dame un num1 / num2
                break;
            default:
                System.out.println("opcion no valida, intentelo despues");
                break;            
        }

    }

    public void Ejercicio2(){

    }

    public void Ejercicio3(){

    }

    public void Ejercicio4(){

    }
}
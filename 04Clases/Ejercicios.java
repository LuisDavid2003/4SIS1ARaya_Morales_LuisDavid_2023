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
                int division, num, num2;
        
                System.out.println("Escriba el numero que desee dividir: ");
                num = entrada.nextInt();
                System.out.println("Introduzca otro valor: ");
                num2 = entrada.nextInt();

                division = num / num2;
            
            System.out.println("El resultado de la operacion es: " + division);
                break;

            default:
                System.out.println("opcion no valida, intentelo despues");
                break;            
        }

    }

    public void Ejercicio2(){
            //vamos a crear un programa que se encargue de convertir
            //kg a libras
            //m/s a km/h
            //m a yardas y millas
            double metros = 0.00, kg = 0.00, cm = 100.00, pulgadas = 0.0254, gramos = 1000.00, libra = 0.453592, ms = 0.00, yardas = 0.914 , millas = 1609.344, kmh = 0.278;
            double conversion1, conversion2;

            System.out.println( "Selecciona la cantidad que deseas convertir acorde a las medidas");
            System.out.println("a. Metros a cm y pulgadas");
            System.out.println("b. Kilogramos a libras y gramos");
            System.out.println("c. m/s a km/h");
            System.out.println("d. Metros a yardas y millas");

            op = entrada.next().charAt(0);

            switch(op){
                case 'a':
                System.out.println("Ingresa los metros que deseas transformar: ");
                metros = entrada.nextDouble();
                conversion1 = metros * cm;
                conversion2 = metros * pulgadas;
                System.out.println("La cantidad en metros es: " + metros + "de m a cm" 
                + conversion1 + "de m a pulgadas son: " + conversion2);
                    break;
                case 'b':
                System.out.println("Ingresa los kilogramos que deseas transformar: ");
                kg = entrada.nextDouble();
                conversion1 = kg * gramos;
                conversion2 = kg * libra;
                System.out.println("La cantidad en kg es: " + kg + "de kg a gramos son" 
                + conversion1 + "de kg a libras son: " + conversion2);
                    break;
                case 'c':
                System.out.println("Ingresa los m/s que deseas transformar: ");
                kg = entrada.nextDouble();
                conversion1 = ms * kmh;
                System.out.println("La cantidad en kg es: " + kg + "de kg a gramos son" 
                + conversion1);
                    break;
                case 'd':
                System.out.println("Ingresa los metros que deseas transformar: ");
                metros = entrada.nextDouble();
                conversion1 = metros * yardas;
                conversion2 = metros * millas;
                System.out.println("La cantidad en metros es: " + metros + "de m a cm" 
                + conversion1 + "de m a pulgadas son: " + conversion2);
                    break;           
            }


    }

    public void Ejercicio3(){
        System.out.println("Bienvenido al cuadro magico");
        int sumaF=0,sumaC=0,sumaD1=0,sumaD2=0,j,sumaC2=0,sumaC3=0, conta=0;
        int[][] cm = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.println("Introduce los numeros que den en total 15 en el cuadro para ver si es verdadero o falso");
                 cm[i][k]=entrada.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sumaF+=cm[i][j];  
            }
            if(sumaF!=15){
                break;
            }else{conta++;}
            sumaF=0;
            sumaC3+=cm[i][2];
            sumaC2+=cm[i][1];
            sumaC+=cm[i][0];
            sumaD1+=cm[i][i];
            sumaD2+=cm[i][j-1];  
        }
        if(conta==3 && (sumaC3+sumaC2+sumaC+sumaD1+sumaD2)%15==0){
            System.out.println("Si coinciden las sumas del cuadro magico, por lo tanto es verdadero");
        }else{
             System.out.println("No coinciden las sumas del cuadro magico, por lo tanto es falso");
        }
         //Mostrar el cuadrado
   for(int i=0; i<3; i++)
   {
     for(int k=0; k<3; k++)
       System.out.print(cm[i][k]+" ");
     System.out.println();
   }

    }


    

    public void Ejercicio4(){

    }
}
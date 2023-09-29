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

        int opcion, numbinario, total, cantidadproducto, num1, num2, lado, lado1, lado2, lado3, base, altura, edad, rst=0, ent=200, factorial, alto, ancho, fila, columna, n;
        float precio, resultado = 0, compra=0, area, perimetro, radio;
        double pi=3.1416, radiocir, perimetrocir, areacir, gradoC, gradoF, gradoK;
        String nombreproducto;
        String binario = "";
        char letra;

        do{
            //aqui va todo el programa
            System.out.println("Bienvenido al programa :3 ");
            System.out.println("Elija alguna de las siguientes opciones: ");
            System.out.println("1. Descuento por edad "); //yo*
            System.out.println("2. Convertir numero decimal a binario "); //profe*
            System.out.println("3. Convertir temperaturas "); //yo*
            System.out.println("4. Numeros positivos y negativos ");//yo* 
            System.out.println("5. Tiendita "); //profe*
            System.out.println("6. Area y perimetro "); //yo*
            System.out.println("7. Tabla "); //profe*
            System.out.println("8. Factorial "); //yo*
            System.out.println("9. Dibujo "); //profe*
            System.out.println("10. Figura Hueca "); //yo*
            System.out.println("11. Patrones de codigo "); //yo*
            System.out.println("12. Diamante "); //yo*
            System.out.println("13. Calculadora "); //yo*
            System.out.println("14. Salir "); //yo*

            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                    //Descuento por edad 
                    System.out.println("Bienvenidos al museo de historia");
                    System.out.println("Compra de entradas a $200, descuento de acuerdo a edades");
                    System.out.println("Que edad tienes");
                    edad = entrada.nextInt();

                    if(edad >= 18){
                        System.out.println("Eres un mayor de edad y tu descuento es del 25%");
                        rst = (int) (ent*0.25);
                        ent = ent-rst;
                        System.out.println("La entrada con descuento es de:" + ent);
                    }

                    if(edad <= 17 && edad >= 6){
                        System.out.println("Eres un menor de edad y tu descuento es del 50%");
                        rst = (int) (ent*0.50);
                        ent = ent-rst;
                        System.out.println("La entrada con descuento es de:" + ent);
                    }

                    if(edad < 6){
                        System.out.println("Eres un niño, el descuento es del 75%");
                        rst = (int) (ent*0.75);
                        ent = ent-rst;
                        System.out.println("La entrada con descuento es de:" + ent);
                    }
                    if(edad == 0){
                        System.out.println("Error");
                    }

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
                    //Convertir temperaturas
                    System.out.println("Elija cual opcion desea convertir");
                    System.out.println("1. Celsius a Fahrenheit");
                    System.out.println("2. Fahrenheit a Kelvin");
                    System.out.println("3. Kelvin a Celsius");

                    opcion = entrada.nextInt();
                    switch (opcion){
                        case 1:
                        System.out.println("Introduzca los grados Celsius");
                        gradoC = entrada.nextDouble();

                        gradoF = 9/5 * gradoC + 32;
                        
                        System.out.println("El resultado es: " + gradoF);
                            break;

                        case 2:
                        System.out.println("Introduzca los grados Fahrenheit");
                        gradoF = entrada.nextDouble();

                        gradoK = gradoF - 32/1.8 + 273.15;

                        System.out.println("El resultado es: " + gradoK);
                            break;
                        case 3:
                        System.out.println("Introduzca los grados Kelvin");
                        gradoK = entrada.nextDouble();

                        gradoC = gradoK - 273.15;

                        System.out.println("El resultado es: " + gradoC);
                            break;
                    }
                    break;
                    
                case 4:
                    //numeros positivos y negativos
                    for(int i = 1; i <= 5; i++){
                    System.out.println("Introduzca un numero: ");
                    num1 = entrada.nextInt();

                    if(num1 > 0){
                        System.out.println("El numero ingresado es positivo");
                    }

                    else if(num1 < 0){
                        System.out.println("El numero ingresado es negativo");
                    }

                    else if(num1 == 0){
                        System.out.println("El numero es neutro: 0");
                    }
                }
                    break;
                    
                case 5:
                    //tiendita
                    System.out.println("Bienvenido a la tiendita");
                    System.out.println("Por favor, introduzca el numero de productos que desea comprar: ");
                    total = entrada.nextInt();

                    for(int i = 1; i <= total; i++){
                        System.out.println("Introduzca el nombre del producto: ");
                        nombreproducto = entrada.next();
                        System.out.println("Introduzca el precio: ");
                        precio = entrada.nextFloat();
                        System.out.println("Introduzca la cantidad del producto: ");
                        cantidadproducto = entrada.nextInt();
                        //operacion
                        resultado = precio * cantidadproducto;
                        compra = compra + resultado; //compra += resultado
                    }
                    System.out.println("El total de la compra es: " + compra);
                    compra = 0;
                    break;
                case 6:
                    //Area y perimetro
                    System.out.println("¿De que figura desea calcular el area y perimetro?");
                    System.out.println("Por favor, seleccione la figura que desea calcular");
                    System.out.println("1. Area y perimetro de un circulo ");
                    System.out.println("2. Area y perimetro de un cuadrado ");
                    System.out.println("3. Area y perimetro de un triangulo ");
                     opcion = entrada.nextInt();
                     switch (opcion){
                        case 1:
                        System.out.println("Introduzca el radio del circulo");
                        radiocir = entrada.nextInt();

                        perimetrocir = 2 * pi * radiocir;
                        areacir = pi*radiocir*radiocir; 

                        System.out.println("El perimetro del circulo es: " + perimetrocir);
                        System.out.println("El area del circulo es: " + areacir);

                            break;

                        case 2:
                        System.out.println("Introduzca el lado del cuadrado en cm");
                        lado = entrada.nextInt();

                        area = lado * lado;
                        perimetro = lado + lado + lado + lado;

                        System.out.println("El area el cuadrado es: cm2" + area);
                        System.out.println("El perimetro del cuadrado es: cm" + perimetro);

                            break;

                        case 3:
                        System.out.println("Introduzca los lados del triangulo en cm");
                        System.out.println("1er lado");                        
                        lado1 = entrada.nextInt();
                        System.out.println("2do lado");
                        lado2 = entrada.nextInt();
                        System.out.println("3er lado");
                        lado3 = entrada.nextInt();
                        System.out.println("Introduzca el valor de la base");
                        base = entrada.nextInt();
                        System.out.println("Introduzca el valor de la altura");
                        altura = entrada.nextInt();

                        perimetro = lado1 + lado2 + lado3;
                        area = base * altura/2;

                        System.out.println("El perimetro del triangulo es: cm" + perimetro);
                        System.out.println("El area del triangulo es: cm2" + area);

                            break;
                     }
                    break;
                case 7:
                //tabla
                System.out.println("Bienvenido a la tabla");
                //ciclo for
                for (n = 1; n <= 10; n++){
                    System.out.println(n + " " + (n*10) + " " + (n*100) + " " + (n*1000) + " ");
                }
                break;

                case 8:
                //Factorial
                System.out.println("Factorial");
                System.out.println("Introduzca un numero");
                num1 = entrada.nextInt();
                factorial = 1;
                for(int i = 1; i<=num1; i++){
                    factorial = factorial * i;
                }
                System.out.println("El factorial de: " +num1+" Es: "+ factorial);
                    break;

                case 9:
                //dibujo kawwaii
                System.out.println("Bienvenido al dibujo (cuadrito magico)");
                System.out.println("Introduzca el tamaño del cuadrado a pintar");
                num1 = entrada.nextInt();
                
                if(num1 >= 1 && num1 <= 20){
                    //ciclo para las filas
                    for(int i = 1; i <= num1; i++){
                        //imprimir columnas
                        for(int j = 1; j <= num1; j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }else{
                    System.out.println("Ingresa solo numeros entre el 1 y 20");
                }
                    break;

                case 10:
                //figura hueca 
                System.out.println("Figura hueca");
                System.out.println("introduzca el lado del cuadrado que sea entre 1 y 20");
                n = entrada.nextInt();
                while (n < 0){
            
                  System.out.println("El numero ingresado es negativo , por favor ingrese un numero positivo");
                  n = entrada.nextInt();
                }
                for(int i = 0;i < n;i++){
                  for(int j = 0;j < n;j++){
                    if (i == 0 || i == n-1 || j == 0 || j == n-1){
                      System.out.print("*");
                    }else{
                      System.out.print(" ");
                    }
                  }
                  System.out.println();
                }
                    break;

                case 11:
                //patrones de codigo
                System.out.println("Bienvenido a los patrones de codigo");
                System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                System.out.printf("%s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                System.out.printf("%2s%s%s%s%s%s%s%s%n","*","*","*","*","*","*","*","*");
                    break;

                case 12:
                //diamante brilloso
                System.out.println("Diamante kawaii");
                int filas = 9;
                    int columnas = filas;
                    int espacios = (columnas - 1) / 2;
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (j < espacios || j > columnas - espacios - 1) {
                                System.out.print(" ");
                            } else { 
                                System.out.print("*");
                            }
                        }
                        System.out.println();
                        if (i < filas / 2) {
                            espacios--;
                        } else { 
                            espacios++;
                        }
                      }
                    break; 

                case 13:
                //calculadora
                System.out.println("Calculadora");
                System.out.println("¿Que desea realizar?");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");

                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                    System.out.println("Ingrese el 1er numero: ");
                    num1 = entrada.nextInt();
                    System.out.println("Ingrese el 2do numero: ");
                    num2 = entrada.nextInt();
                    resultado = num1 + num2;

                    System.out.println("La suma es: " + resultado);
                        break;
                    case 2:
                    System.out.println("Ingrese el 1er numero: ");
                    num1 = entrada.nextInt();
                    System.out.println("Ingrese el 2do numero: ");
                    num2 = entrada.nextInt();
                    resultado = num1 - num2;

                    System.out.println("La resta es: " + resultado);
                        break;
                    
                    case 3:
                    System.out.println("Ingrese el 1er numero: ");
                    num1 = entrada.nextInt();
                    System.out.println("Ingrese el 2do numero: ");
                    num2 = entrada.nextInt();
                    resultado = num1 * num2;

                    System.out.println("La multiplicacion es: " + resultado);
                        break;

                    case 4:
                    System.out.println("Ingrese el 1er numero: ");
                    num1 = entrada.nextInt();
                    System.out.println("Ingrese el 2do numero: ");
                    num2 = entrada.nextInt();
                    resultado = num1 / num2;

                    System.out.println("La division es: " + resultado);
                        break;        
                }

                    break;
                case 14:
                //salir
                    System.out.println("Hasta pronto");
                    System.exit(0);
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
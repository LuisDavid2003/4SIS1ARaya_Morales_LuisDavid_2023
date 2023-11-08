
import java.util.Scanner;


public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una palabra o una frase para ver si es un palindromo o no: ");
        String input = scanner.nextLine();
        scanner.close();

        if (esPalindromo(input)) {
            System.out.println("Si es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

    public static boolean esPalindromo(String str) {
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase(); 
        int izquierda = 0;
        int derecha = str.length() - 1;

        while (izquierda < derecha) {
            if (str.charAt(izquierda) != str.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}

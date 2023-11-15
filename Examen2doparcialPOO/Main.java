/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package supermercado;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Ejemplo de agregado de cereales al inventario
        Cereal cereal1 = new Cereal("Cereal de Maíz", 20, 3.99);
        Cereal cereal2 = new Cereal("Cereal de Trigo", 15, 4.50);

        inventario.agregarCereal(cereal1);
        inventario.agregarCereal(cereal2);

        // Mostrar el inventario de cereales
        for (Cereal cereal : inventario.getInventarioCereales()) {
            System.out.println(cereal.toString());
        }
    }
}


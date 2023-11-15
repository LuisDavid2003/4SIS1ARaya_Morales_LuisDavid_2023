/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package supermercado;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Cereal> inventarioCereales;

    public Inventario() {
        this.inventarioCereales = new ArrayList<>();
    }

    public void agregarCereal(Cereal cereal) {
        inventarioCereales.add(cereal);
    }

    public ArrayList<Cereal> getInventarioCereales() {
        return inventarioCereales;
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2;

import java.util.ArrayList;

/**
 *
 * @author rian
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Membuat objek Hewan dan mengisinya dengan data hewan
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        
        // Membuat objek DeleteHewan dan mengisinya dengan data hewan yang akan dihapus
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        
        System.out.println("Hewan :" +Hewan);
        
        // Menghapus data yang sama di antara objek Hewan dan DeleteHewan
        System.out.println("Hewan yang dihapus:");
        for (String hewan : DeleteHewan) {
            Hewan.removeIf(h -> h.equals(hewan));
            System.out.println(hewan);
        }
        
        
        // Menampilkan isi objek Hewan setelah data dihapus
        System.out.println("output hewan:");
        for (String hewan : Hewan) {
            System.out.println(hewan);
        }
    }
}

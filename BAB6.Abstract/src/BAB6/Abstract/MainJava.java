/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author ASUS
 */
public class MainJava {
    public static void main(String[] args) {

        // Polymorphism
        JadwalBadminton j1 = new JadwalMain(
                "30 April 2026", "19:00", "Lapangan GBK",
                "Amada/Jibran", "Zergio/Hariz"
        );

        JadwalBadminton j2 = new JadwalTunggal(
                "1 Mei 2026", "20:00", "Lapangan Istora Senayan",
                "Amada"
        );

        System.out.println("=== SISTEM JADWAL BADMINTON (ABSTRACT) ===");
        System.out.println(j1);
        System.out.println(j2);
    }
}
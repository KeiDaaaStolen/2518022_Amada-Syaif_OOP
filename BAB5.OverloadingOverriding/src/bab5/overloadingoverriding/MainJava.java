/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5.overloadingoverriding;

/**
 *
 * @author ASUS
 */
public class MainJava {
   
    public static void main(String[] args) {

        JadwalMain ganda = new JadwalMain(
                "30 April 2026",
                "19:00",
                "Lapangan A",
                "Andi/Budi",
                "Raka/Fajar"
        );

        JadwalTunggal tunggal = new JadwalTunggal(
                "1 Mei 2026",
                "20:00",
                "Lapangan B",
                "Kevin",
                "Rizky"
        );

        System.out.println("=== Jadwal Ganda ===");
        System.out.println(ganda.tampilkanJadwal());

        System.out.println("\n=== Jadwal Tunggal ===");
        System.out.println(tunggal.tampilkanJadwal());
    }
}
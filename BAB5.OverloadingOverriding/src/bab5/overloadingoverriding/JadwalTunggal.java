/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5.overloadingoverriding;
/**
 * Subclass JadwalTunggal
 * Demonstrasi Method Overriding
 */
public class JadwalTunggal extends JadwalBadminton {

    public JadwalTunggal(String tanggal, String jam, String lapangan,
                         String pasangan1, String pasangan2) {
        super(tanggal, jam, lapangan, pasangan1, pasangan2);
    }

    // OVERRIDING
    @Override
    public String tampilkanJadwal() {
        return "Tanggal : " + getTanggal() +
               "\nJam : " + getJam() +
               "\nLapangan : " + getLapangan() +
               "\nMode : Tunggal" +
               "\nPemain 1 : " + getPasangan1() +
               "\nPemain 2 : " + getPasangan2();
    }
}
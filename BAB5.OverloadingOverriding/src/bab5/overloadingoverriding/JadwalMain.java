/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5.overloadingoverriding;

/**
 * Subclass JadwalMain (Ganda/Double)
 * Demonstrasi Method Overriding
 */
public class JadwalMain extends JadwalBadminton {

    public JadwalMain(String tanggal, String jam, String lapangan,
                      String pasangan1, String pasangan2) {
        super(tanggal, jam, lapangan, pasangan1, pasangan2);
    }

    // OVERRIDING
    @Override
    public String tampilkanJadwal() {
        return super.tampilkanJadwal() +
               "\nMode : Ganda" +
               "\nPasangan 1 : " + getPasangan1() +
               "\nPasangan 2 : " + getPasangan2();
    }
}
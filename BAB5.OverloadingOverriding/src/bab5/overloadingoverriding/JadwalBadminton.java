/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5.overloadingoverriding;

public class JadwalBadminton {

    // atribut private (enkapsulasi)
    private String tanggal;
    private String jam;
    private String lapangan;
    private String pasangan1;
    private String pasangan2;

    // constructor
    public JadwalBadminton(String tanggal, String jam, String lapangan,
                           String pasangan1, String pasangan2) {
        this.tanggal = tanggal;
        this.jam = jam;
        this.lapangan = lapangan;
        this.pasangan1 = pasangan1;
        this.pasangan2 = pasangan2;
    }

    // getter
    public String getTanggal() {
        return tanggal;
    }

    public String getJam() {
        return jam;
    }

    public String getLapangan() {
        return lapangan;
    }

    public String getPasangan1() {
        return pasangan1;
    }

    public String getPasangan2() {
        return pasangan2;
    }

    // method biasa
    public String tampilkanJadwal() {
        return "Tanggal : " + tanggal +
               "\nJam : " + jam +
               "\nLapangan : " + lapangan;
    }

    // OVERLOADING
    public String tampilkanJadwal(String mode) {
        return tampilkanJadwal() +
               "\nMode Permainan : " + mode;
    }
}
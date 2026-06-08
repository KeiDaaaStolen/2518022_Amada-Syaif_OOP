/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab9_Interface;

/**
 *
 * @author ASUS
 */
public class JadwalGanda extends JadwalBadminton {
    private String pasangan1;
    private String pasangan2;

    // Constructor Kosong
    public JadwalGanda() {
        super();
    }

    // Constructor Utama
    public JadwalGanda(String tanggal, String jam, String lapangan, 
                       String pemain1, String pemain2, String pasangan1, String pasangan2) {
        super(tanggal, jam, lapangan, pemain1, pemain2);
        this.pasangan1 = pasangan1;
        this.pasangan2 = pasangan2;
    }

    @Override
    public String getKategori() {
        return "Ganda"; 
    }

    @Override
    public double hitungBiayaSewa() {
        return 60000.0;
    }

    public String getPasangan1() { return pasangan1; }
    public void setPasangan1(String pasangan1) { this.pasangan1 = pasangan1; }

    public String getPasangan2() { return pasangan2; }
    public void setPasangan2(String pasangan2) { this.pasangan2 = pasangan2; }

    // ================= OVERRIDE METHOD DARI 3 INTERFACE (TUGAS 9) =================
    @Override
    public double hitungBiayaRaket() {
        return 30000.0; // Biaya raket ganda (4 raket)
    }

    @Override
    public double hitungPotongan(double totalAwal) {
        return totalAwal * 0.10; // Diskon 10%
    }

    @Override
    public double hitungTotalAkhir(int lamaJam) {
        double totalAwal = (hitungBiayaSewa() * lamaJam) + hitungBiayaRaket();
        return totalAwal - hitungPotongan(totalAwal);
    }
}
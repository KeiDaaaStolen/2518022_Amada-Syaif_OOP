/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab9_Interface;

/**
 *
 * @author ASUS
 */
public class JadwalTunggal extends JadwalBadminton {

    // Constructor Kosong
    public JadwalTunggal() {
        super();
    }

    // Constructor Utama
    public JadwalTunggal(String tanggal, String jam, String lapangan, String pemain1, String pemain2) {
        super(tanggal, jam, lapangan, pemain1, pemain2);
    }

    @Override
    public String getKategori() {
        return "Tunggal"; 
    }

    @Override
    public double hitungBiayaSewa() {
        return 40000.0;
    }

    // ================= OVERRIDE METHOD DARI 3 INTERFACE (TUGAS 9) =================
    @Override
    public double hitungBiayaRaket() {
        return 15000.0; // Biaya raket tunggal
    }

    @Override
    public double hitungPotongan(double totalAwal) {
        return totalAwal * 0.05; // Diskon 5%
    }

    @Override
    public double hitungTotalAkhir(int lamaJam) {
        double totalAwal = (hitungBiayaSewa() * lamaJam) + hitungBiayaRaket();
        return totalAwal - hitungPotongan(totalAwal);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7.polimorfisme;

/**
 *
 * @author ASUS
 */
public class JadwalTunggal extends JadwalBadminton {

    // Constructor Kosong (Tambahan untuk Polimorfisme)
    public JadwalTunggal() {
        super();
    }

    // Constructor meneruskan parameter ke parent class menggunakan super()
    public JadwalTunggal(String tanggal, String jam, String lapangan, String pemain1, String pemain2) {
        super(tanggal, jam, lapangan, pemain1, pemain2);
    }

    // ================= IMPLEMENTASI METHOD OVERRIDING (KATEGORI) =================
    @Override
    public String getKategori() {
        return "Tunggal"; 
    }

    // ================= OVERRIDE ABSTRACT METHOD (TUGAS 6) =================
    @Override
    public double hitungBiayaSewa() {
        return 40000.0;
    }
}
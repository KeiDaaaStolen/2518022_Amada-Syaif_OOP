/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author ASUS
 */
// JadwalTunggal mewarisi abstract class JadwalBadminton
public class JadwalTunggal extends JadwalBadminton {

    // Constructor meneruskan parameter ke parent class menggunakan super()
    public JadwalTunggal(String tanggal, String jam, String lapangan, String pemain1, String pemain2) {
        super(tanggal, jam, lapangan, pemain1, pemain2);
    }

    // ================= IMPLEMENTASI METHOD OVERRIDING (KATEGORI) =================
    @Override
    public String getKategori() {
        return "Tunggal"; // Mendefinisikan ulang isi dari parent class
    }

    // ================= OVERRIDE ABSTRACT METHOD (TUGAS 6) =================
    // Mengimplementasikan logika perhitungan biaya sewa khusus untuk kategori tunggal
    @Override
    public double hitungBiayaSewa() {
        // Berupa contoh konstan: Biaya flat sewa lapangan tunggal Rp 40000
        return 40000.0;
    }
}
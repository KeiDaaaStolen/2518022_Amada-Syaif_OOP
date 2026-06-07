/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author ASUS
 */
// JadwalGanda mewarisi abstract class JadwalBadminton
public class JadwalGanda extends JadwalBadminton {
    private String pasangan1;
    private String pasangan2;

    // Constructor Utama kelas anak ganda
    public JadwalGanda(String tanggal, String jam, String lapangan, 
                       String pemain1, String pemain2, String pasangan1, String pasangan2) {
        super(tanggal, jam, lapangan, pemain1, pemain2);
        this.pasangan1 = pasangan1;
        this.pasangan2 = pasangan2;
    }

    // ================= IMPLEMENTASI METHOD OVERRIDING (KATEGORI) =================
    @Override
    public String getKategori() {
        return "Ganda"; // Mendefinisikan ulang isi dari parent class
    }

    // ================= OVERRIDE ABSTRACT METHOD (TUGAS 6) =================
    // Mengimplementasikan logika perhitungan biaya sewa khusus untuk kategori ganda
    @Override
    public double hitungBiayaSewa() {
        // Berupa contoh konstan: Biaya flat sewa lapangan ganda Rp 60000
        return 60000.0;
    }

    // Getter dan Setter Khusus Ganda
    public String getPasangan1() { return pasangan1; }
    public void setPasangan1(String pasangan1) { this.pasangan1 = pasangan1; }

    public String getPasangan2() { return pasangan2; }
    public void setPasangan2(String pasangan2) { this.pasangan2 = pasangan2; }
}

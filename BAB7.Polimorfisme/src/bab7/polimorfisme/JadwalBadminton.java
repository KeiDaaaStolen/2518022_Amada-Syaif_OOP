/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab7.polimorfisme;

/**
 *
 * @author ASUS
 */
public abstract class JadwalBadminton {
    // Atribut enkapsulasi
    private String tanggal;
    private String jam;
    private String lapangan;
    private String pemain1;
    private String pemain2;

    // Constructor Kosong (Tambahan untuk mempermudah Polimorfisme)
    public JadwalBadminton() {
    }

    // Constructor Utama untuk menginisialisasi data dasar
    public JadwalBadminton(String tanggal, String jam, String lapangan, String pemain1, String pemain2) {
        this.tanggal = tanggal;
        this.jam = jam;
        this.lapangan = lapangan;
        this.pemain1 = pemain1;
        this.pemain2 = pemain2;
    }

    // Method dasar biasa (non-abstract) untuk mengembalikan kategori umum
    public String getKategori() {
        return "Umum";
    }
    
    // ================= IMPLEMENTASI ABSTRACT METHOD (TUGAS 6) =================
    public abstract double hitungBiayaSewa();

    // ================= IMPLEMENTASI METHOD OVERLOADING =================
    public String infoSingkat() {
        return lapangan + " - " + jam;
    }

    public String infoSingkat(String statusCetak) {
        return "[" + statusCetak + "] " + lapangan + " (" + jam + ")";
    }

    // ================= GETTER & SETTER (ENKAPSULASI) =================
    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }

    public String getJam() { return jam; }
    public void setJam(String jam) { this.jam = jam; }

    public String getLapangan() { return lapangan; }
    public void setLapangan(String lapangan) { this.lapangan = lapangan; }

    public String getPemain1() { return pemain1; }
    public void setPemain1(String pemain1) { this.pemain1 = pemain1; }

    public String getPemain2() { return pemain2; }
    public void setPemain2(String pemain2) { this.pemain2 = pemain2; }
}
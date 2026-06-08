/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab9_Interface;

/**
 *
 * @author ASUS
 */
public abstract class JadwalBadminton implements Fasilitas, Diskon, Durasi {
    // Atribut enkapsulasi
    private String tanggal;
    private String jam;
    private String lapangan;
    private String pemain1;
    private String pemain2;

    // Constructor Kosong
    public JadwalBadminton() {
    }

    // Constructor Utama
    public JadwalBadminton(String tanggal, String jam, String lapangan, String pemain1, String pemain2) {
        this.tanggal = tanggal;
        this.jam = jam;
        this.lapangan = lapangan;
        this.pemain1 = pemain1;
        this.pemain2 = pemain2;
    }

    public String getKategori() {
        return "Umum";
    }
    
    // Abstract Method (Tugas 6)
    public abstract double hitungBiayaSewa();

    // Method Overloading
    public String infoSingkat() {
        return lapangan + " - " + jam;
    }

    public String infoSingkat(String statusCetak) {
        return "[" + statusCetak + "] " + lapangan + " (" + jam + ")";
    }

    // Getter & Setter (Enkapsulasi)
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
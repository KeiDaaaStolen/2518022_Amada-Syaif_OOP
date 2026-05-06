/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author ASUS
 */
public abstract class JadwalBadminton {
    private String tanggal;
    private String jam;
    private String lapangan;
    private String pemain1;
    private String pemain2;

    // Constructor
    public JadwalBadminton(String tanggal, String jam, String lapangan, String pemain1, String pemain2) {
        this.tanggal = tanggal;
        this.jam = jam;
        this.lapangan = lapangan;
        this.pemain1 = pemain1;
        this.pemain2 = pemain2;
    }

    // Getter (enkapsulasi)
    public String getTanggal() { return tanggal; }
    public String getJam() { return jam; }
    public String getLapangan() { return lapangan; }
    public String getPemain1() { return pemain1; }
    public String getPemain2() { return pemain2; }

    // Abstract method (WAJIB di override)
    public abstract String cekKategori();

    // Method biasa
    public String tampilkanDasar() {
        return "Tanggal  : " + tanggal +
               "\nJam      : " + jam +
               "\nLapangan : " + lapangan;
    }
}
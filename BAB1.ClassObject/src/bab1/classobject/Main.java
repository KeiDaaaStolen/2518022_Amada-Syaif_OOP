/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab1.classobject;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {

        // membuat objek
        Badminton badminton1 = new Badminton();

        badminton1.namaPemain = "Amada";
        badminton1.namaLapangan = "Lapangan GBK";
        badminton1.tanggal = "10 Agustus 2026";

        System.out.println("Nama Pemain : " + badminton1.namaPemain);
        System.out.println("Lapangan : " + badminton1.namaLapangan);
        System.out.println("Tanggal Main : " + badminton1.tanggal);
        System.out.println("Durasi Main : " + badminton1.durasiMain(2) + " jam\n");

        System.out.println("Status Permainan : ");
        System.out.print("Saat mulai : ");
        badminton1.mulaiMain();

        System.out.print("Saat selesai : ");
        badminton1.selesaiMain();
    }
}

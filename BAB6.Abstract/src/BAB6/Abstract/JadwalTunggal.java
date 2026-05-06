/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author ASUS
 */
public class JadwalTunggal extends JadwalBadminton {

    public JadwalTunggal(String tanggal, String jam, String lapangan, String pemain1) {
        super(tanggal, jam, lapangan, pemain1, "-");
    }

    @Override
    public String cekKategori() {
        return "Kategori : Tunggal (Single)";
    }

    @Override
    public String toString() {
        return tampilkanDasar() + "\n" + cekKategori() +
               "\nPemain : " + getPemain1() +
               "\n=============================";
    }
}
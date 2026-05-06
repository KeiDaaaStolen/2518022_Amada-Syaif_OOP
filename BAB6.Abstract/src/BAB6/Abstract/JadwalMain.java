/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author ASUS
 */
public class JadwalMain extends JadwalBadminton {

    public JadwalMain(String tanggal, String jam, String lapangan, String pemain1, String pemain2) {
        super(tanggal, jam, lapangan, pemain1, pemain2);
    }

    @Override
    public String cekKategori() {
        return "Kategori : Ganda (Double)";
    }

    @Override
    public String toString() {
        return tampilkanDasar() + "\n" + cekKategori() +
               "\nPemain 1 : " + getPemain1() +
               "\nPemain 2 : " + getPemain2() +
               "\n=============================";
    }
}
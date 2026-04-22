/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author ASUS
 */
/*
Class Child untuk jadwal Ganda
Inheritance dari JadwalBadminton
*/
/*
Class Child untuk jadwal Ganda
Inheritance dari JadwalBadminton
*/
/*
Class Child untuk jadwal Ganda
Inheritance dari JadwalBadminton
*/
public class JadwalMain extends JadwalBadminton {

    // Constructor Child
    public JadwalMain(String tanggal, String jam, String lapangan,
                      String pasangan1, String pasangan2){
        super(tanggal, jam, lapangan, pasangan1, pasangan2);
    }

    // Override method dari parent
    @Override
    public String tampilkanJadwal(){
        return super.tampilkanJadwal() +
               "\nPasangan 1 : " + getPasangan1() +
               "\nPasangan 2 : " + getPasangan2();
    }
}

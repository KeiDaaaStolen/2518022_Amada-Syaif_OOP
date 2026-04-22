/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
package BAB4.Enkapsulasi;

/*
Class Parent Jadwal Badminton
Digunakan untuk menyimpan data jadwal umum badminton
*/
public class JadwalBadminton {
    
    // Atribut dengan enkapsulasi (private)
    private String tanggal;
    private String jam;
    private String lapangan;
    private String pasangan1;
    private String pasangan2;

    // Constructor
    public JadwalBadminton(String tanggal, String jam, String lapangan,
                           String pasangan1, String pasangan2){
        this.tanggal = tanggal;
        this.jam = jam;
        this.lapangan = lapangan;
        this.pasangan1 = pasangan1;
        this.pasangan2 = pasangan2;
    }

    // Getter Method
    public String getTanggal(){
        return tanggal;
    }

    public String getJam(){
        return jam;
    }

    public String getLapangan(){
        return lapangan;
    }

    public String getPasangan1(){
        return pasangan1;
    }

    public String getPasangan2(){
        return pasangan2;
    }

    // Method menampilkan jadwal
    public String tampilkanJadwal(){
        return "Tanggal : " + tanggal +
               "\nJam : " + jam +
               "\nLapangan : " + lapangan;
    }
}

package bab3.inheritance;

public class JadwalBadminton {

    protected String tanggal;
    protected String jam;
    protected String lapangan;
    protected String pemain1;
    protected String pemain2;

    public JadwalBadminton(String tanggal, String jam, String lapangan, String pemain1, String pemain2) {
        this.tanggal = tanggal;
        this.jam = jam;
        this.lapangan = lapangan;
        this.pemain1 = pemain1;
        this.pemain2 = pemain2;
    }

    // Diubah jadi return String agar bisa ditampilkan di GUI
    public String tampilkanJadwal() {
        String info = "Tanggal   : " + tanggal + "\n" +
                      "Jam       : " + jam + "\n" +
                      "Lapangan  : " + lapangan + "\n";
        return info;
    }
}
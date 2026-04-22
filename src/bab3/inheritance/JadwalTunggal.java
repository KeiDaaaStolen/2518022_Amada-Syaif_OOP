package bab3.inheritance;

public class JadwalTunggal extends JadwalBadminton {

    public JadwalTunggal(String tanggal, String jam, String lapangan, String pemain1, String pemain2) {
        super(tanggal, jam, lapangan, pemain1, pemain2);
    }

    @Override
    public String tampilkanJadwal() {
        String info = super.tampilkanJadwal();   // ambil dari parent
        info += "Jenis     : Tunggal\n" +
                "Pertandingan : " + pemain1 + " vs " + pemain2 + "\n" +
                "=====================================\n";
        return info;
    }
}
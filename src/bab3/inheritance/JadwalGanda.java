package bab3.inheritance;

public class JadwalGanda extends JadwalBadminton {

    private String pasangan1;
    private String pasangan2;

    public JadwalGanda(String tanggal, String jam, String lapangan, 
                       String pemain1, String pemain2, String pasangan1, String pasangan2) {
        super(tanggal, jam, lapangan, pemain1, pemain2);
        this.pasangan1 = pasangan1;
        this.pasangan2 = pasangan2;
    }

    @Override
    public String tampilkanJadwal() {
        String info = super.tampilkanJadwal();
        info += "Jenis     : Ganda\n" +
                "Pasangan 1: " + pasangan1 + "\n" +
                "Pasangan 2: " + pasangan2 + "\n" +
                "=====================================\n";
        return info;
    }
}
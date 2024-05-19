package soal4;

public class TeoriKuantumCahaya {
    private double konstantaPlanck;
    private double kecepatanCahaya;

    // Constructor
    public TeoriKuantumCahaya(double konstantaPlanck, double kecepatanCahaya) {
        this.konstantaPlanck = konstantaPlanck;
        this.kecepatanCahaya = kecepatanCahaya;
        System.out.println("Konstanta Planck : " +  konstantaPlanck + " Js");
        System.out.println("Kecepatan Cahaya : " +  kecepatanCahaya + " m/s");
    }

    public double energiFoton(double panjangGelombang, double kecepatanCahaya) {
        return ((konstantaPlanck * kecepatanCahaya) / panjangGelombang);
    }

    public double energiFoton(double frekuensi) {
        return (konstantaPlanck * frekuensi);
    }

    public static void main(String[] args) {
        TeoriKuantumCahaya energi = new TeoriKuantumCahaya(6.626e-34, 3.0e8);

        double konstantaPlanck = 6.626e-34;
        double kecepatanCahaya = 3.0e8;
        double panjangGelombang = 5.0e-7;
        double frekuensi = 6.0e14;

        double  energiFotonPanjangGelombang = energi.energiFoton(panjangGelombang, kecepatanCahaya);
        System.out.println("Energi Foton dengan panjang Gelombang : " +  energiFotonPanjangGelombang + " Joule");

        double  energiFotonFrekuensi = energi.energiFoton(frekuensi);
        System.out.println("Energi Foton dengan Frekuensi : " +  energiFotonFrekuensi + " Joule");
    }
}

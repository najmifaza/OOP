package Televisi_2;

public class Televisi {
    private String merek;
    private String harga;
    private int chanel;

    public Televisi(String merek, String harga) {
        this.merek = merek;
        this.harga = harga;
    }

    public void informasiTv() {
        System.out.println("Merek TV : " + merek);
        System.out.println("Harga TV : " + harga);
    }

    public void hidupkanTv() {
        System.out.println("Televisi dihidupkan");
    }

    public void matikanTv() {
        System.out.println("Televisi dimatikan");
    }

    public void setChanel(int chanel) {
        this.chanel = chanel;
    }

    public int getChanel() {
        return chanel;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}

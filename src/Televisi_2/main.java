package Televisi_2;

public class main {

    public static void main(String[] args) {
        Televisi tvFlat = new Televisi ("Sharp", "3Juta");
        tvFlat.informasiTv();
        tvFlat.hidupkanTv();
        tvFlat.setChanel(1);
        System.out.println("Televisi diset pada chanel : " +tvFlat.getChanel());
        tvFlat.matikanTv();
    }
}

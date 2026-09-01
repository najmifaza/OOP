package BujurSangkar_1;

public class main {
    public void main(String[] args) {
        bujurSangkar bujurSangkar = new bujurSangkar();
        Persegi Persegi = new Persegi();
        System.out.println("luas bujur sangkar " + bujurSangkar.hitungLuas(4));
        System.out.println("keliling bujur sangkar " + bujurSangkar.hitungKeliling(5));
        System.out.println("luas persegi " + Persegi.hitungLuas(6,4));
        System.out.println("keliling persegi " + Persegi.hitungKeliling(6,4));
    }
}

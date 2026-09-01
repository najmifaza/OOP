package BujurSangkar_1;

public class main {
    public void main(String[] args) {
        bujurSangkar bujurSangkarObj = new bujurSangkar();
        Persegi PersegiObj = new Persegi();
        System.out.println("luas bujur sangkar " + bujurSangkarObj.hitungLuas(4));
        System.out.println("keliling bujur sangkar " + bujurSangkarObj.hitungKeliling(5));
        System.out.println("luas persegi " + PersegiObj.hitungLuas(6,4));
        System.out.println("keliling persegi " + PersegiObj.hitungKeliling(6,4));
    }
}

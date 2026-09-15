package inheritance_3;

public class main {
    public static void main (String[] args){
        SepedaGunung Poligon = new SepedaGunung();
        Poligon.gear=1;
        Poligon.pedal=2;
        Poligon.setLampu(1);
        Poligon.setShockbreaker(2);
        Poligon.setTempatMinum(1);
        System.out.println("jumlah gear: "+Poligon.gear +"\nJumlah Pedal :  "+ Poligon.kecepatan+"\nLampu : "+Poligon.getLampu()+"\n Shockbreaker : " + Poligon.getShockbreaker());
    }
}

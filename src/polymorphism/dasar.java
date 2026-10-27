package polymorphism;

public class dasar {
    private int x;
    public dasar (int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }
    public void tampilkaninformasi(){
        System.out.println("Method dari class induk");
        System.out.println("X = " + x );
    }
}

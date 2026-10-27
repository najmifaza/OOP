package polymorphism;

public class turunan extends dasar {
    private int y;

    public turunan (int x, int y){
        super(x);
        this.y =y;
    }
    public void tampilkaninformasi (){
        System.out.println("Method dari class turunan");
        System.out.println("nilai X = " + getX());
        System.out.println("Y = " + y);
    }

}

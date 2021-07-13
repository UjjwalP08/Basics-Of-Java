//Use constructor and repeat P9_prg1

package Practice_sets;

class cylinder1 {

    private int r;

    private int h;

    public cylinder1(int r, int h) {
        this.r = r;
        this.h = h;
    }

    public double area()
    {
        return (2*Math.PI*r*r) + (2*Math.PI*r*h) ;
    }

    public double volume()
    {
        return Math.PI*r*r*h;
    }
}

public class P9_prg2 {

    public static void main(String[] args) {

        cylinder1 cc = new cylinder1(10,5);

        System.out.println("Area is "+ cc.area());

        System.out.println("Volume is "+ cc.volume());

    }
}

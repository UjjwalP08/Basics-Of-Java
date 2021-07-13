// Repeat program 1 of PS 9 for Sphere

package Practice_sets;

class sphere{

    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public  double volume()
    {
        return (4*Math.PI*r*r*r)/3;
    }

    public double area()
    {
        return 4 * Math.PI * r * r;

    }



}

public class P9_prg4 {
    public static void main(String[] args) {

        sphere sph = new sphere();

        sph.setR(5);

        System.out.println(sph.getR());

        System.out.println("Area of sphere is " + sph.area());
        System.out.println("volume of sphere is " + sph.volume());
    }

}

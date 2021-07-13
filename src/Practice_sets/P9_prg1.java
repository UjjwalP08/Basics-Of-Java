// Creates a class cylinder and use getters and setters to set its radius and height

package Practice_sets;

class  cylinder{

    private int r;

    private int h;

    public void setH(int h) {
        this.h = h;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public int getR() {
        return r;
    }

    //Problem no 2:- Use P9_prg1 to calculate surface area and volume of cylinder

    public double area()
    {
        return (2*Math.PI*r*r) + (2*Math.PI*r*h) ;
    }

    public double volume()
    {
        return Math.PI*r*r*h;
    }
}




public class P9_prg1 {
    public static void main(String[] args) {

        cylinder cc = new cylinder();

        cc.setH(10);
        cc.setR(5);

//        System.out.println(cc.getH());
//        System.out.println(cc.getR());

        System.out.println("Area of cylinder is "+cc.area());
        System.out.println("Volume of cylinder is "+cc.volume());

    }
}

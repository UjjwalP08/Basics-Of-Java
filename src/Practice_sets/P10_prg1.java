/**
 * create a Class circle and use inheritance to create another class cylinder and also crete method
 * area and volume
 */


package Practice_sets;

class circle1 {

    public int radius;

//    circle1() {
//        System.out.println("I am constructor without parameter ");
//    }

    circle1(int r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

}

class cylinder2 extends circle1 {

    public int height;

    cylinder2(int h, int r) {
        super(r);
        this.height = h;
    }

    @Override
    public double area() {
        return ((2 * Math.PI * this.height * this.radius) + (2 * Math.PI * this.radius * this.radius));
    }

    public double volume() {
        return Math.PI * this.height * this.radius * this.radius;
    }
}

public class P10_prg1 {
    public static void main(String[] args) {

        circle1 c1 = new circle1(4);

        System.out.println(c1.area());

        cylinder2 c2 = new cylinder2(4, 6);

        System.out.println(c2.area());
        System.out.println(c2.volume());


    }
}

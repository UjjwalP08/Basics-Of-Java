/**
 * create class rectangle use inheritance to create class cuboid and compare with real life scenario
 * */

package Practice_sets;

class rectangle1 {

    public int height;
    public int width;

    rectangle1() {
        System.out.println("This is unknown parameter");
    }


    rectangle1(int h, int w) {
        this.height = h;

        this.width = w;
    }

    public int area() {
        return this.height + this.width;
    }

    public int volume() {
        return this.width * this.height;
    }


}

class cuboid extends rectangle1 {

    public int length;


    cuboid(int h, int w, int l) {

        super(h, w);
        this.length = l;
    }

    public cuboid() {

    }

    @Override
    public int area() {
        return 2 * ((this.length * this.width) + (this.width * this.height) + (this.height * this.length));
    }

    @Override
    public int volume() {
        return this.length * this.width * this.height;
    }
}

public class P10_prg2 {
    public static void main(String[] args) {

        rectangle1 r1 = new rectangle1(4, 6);

        cuboid c1 = new cuboid(4, 5, 6);

        System.out.println(r1.area());
        System.out.println(r1.volume());

        System.out.println(c1.volume());
        System.out.println(c1.area());
    }
}

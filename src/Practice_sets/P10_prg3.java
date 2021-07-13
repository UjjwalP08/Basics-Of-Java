package Practice_sets;

/*Use getter and setter in program 2 of practice set 10*/
class rectangle2 {

    public int height;
    public int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int area() {
        return this.height + this.width;
    }

    public int volume() {
        return this.width * this.height;
    }


}

class cuboid1 extends rectangle2 {

    public int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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

public class P10_prg3 {
    public static void main(String[] args) {

        rectangle1 r1 = new rectangle1();

        cuboid c1 = new cuboid();


r1.height=5;
r1.width=6;
        System.out.println(r1.area());
        System.out.println(r1.volume());
        c1.height=4;
        c1.width=5;
        c1.length=6;

        System.out.println(c1.volume());
        System.out.println(c1.area());
    }
}

//Create class circle with method initialize  it's side ,calculating area and perimeter etc....

package Practice_sets;

class circle{
    double side;

    public double area()
    {
        return 3.14*(side*side);
    }

    public double perimeter()
    {
        return 2*3.14*side;
    }
}

public class P8_prg6 {
    public static void main(String[] args) {

        circle sq = new circle();

        sq.side=6;

        System.out.println("The area of given square is "+ sq.area());
        System.out.println("The perimeter of given square is "+ sq.perimeter());

    }
}

//Create class square with method initialize  it's side ,calculating area and perimeter etc....

package Practice_sets;

class square{
    int side;

    public int area()
    {
        return side*side;
    }

    public int perimeter()
    {
        return 4*side;
    }
}

public class P8_prg3 {
    public static void main(String[] args) {

        square sq = new square();

        sq.side=6;

        System.out.println("The area of given square is "+ sq.area());
        System.out.println("The perimeter of given square is "+ sq.perimeter());

    }
}

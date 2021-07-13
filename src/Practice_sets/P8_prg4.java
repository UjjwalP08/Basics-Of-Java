//Create class rectangle with method initialize  it's side ,calculating area and perimeter etc....

package Practice_sets;

class rectangle{
    int side;
    int width;

    public int area()
    {
        return width*side;
    }

    public int perimeter()
    {
        return 2*(side+width);
    }
}

public class P8_prg4 {
    public static void main(String[] args) {

        rectangle sq = new rectangle();

        sq.side=6;
        sq.width=4;

        System.out.println("The area of given square is "+ sq.area());
        System.out.println("The perimeter of given square is "+ sq.perimeter());

    }
}

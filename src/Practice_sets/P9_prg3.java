// Overload a constructor initialize a rectangle length 4 and breadth 5 for using custom parameters

package Practice_sets;

class rect1{

    private int l;

    private  int b;

    public int getL() {
        return l;
    }

    public int getB() {
        return b;
    }

    public rect1(){
        this.l = 4;

        this.b = 5;
    }
    public rect1(int l, int b) { // Constructor overloading
        this.l = l;
        this.b = b;
    }
}

public class P9_prg3 {
    public static void main(String[] args) {
        rect1 rec = new rect1();

        System.out.println("By default length is "+ rec.getL());
        System.out.println("By default breadth is "+ rec.getB());

        System.out.println();

        rect1 rec1 = new rect1(8,9);


        System.out.println("New length is "+ rec1.getL());
        System.out.println("New breadth is "+ rec1.getB());

    }
}

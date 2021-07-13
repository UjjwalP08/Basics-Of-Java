// Crete class Tommy for rockstar games which is cable of hit(print Hitting),run and fire......

package Practice_sets;

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class P8_prg5 {
    public static void main(String[] args) {
        Tommy tm = new Tommy();

        tm.hit();
        tm.run();
        tm.fire();
    }
}

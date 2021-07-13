// Create Cellphone name class and create method like ring,vibrate etc...

package Practice_sets;

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Annikki...");
    }

}
public class P8_prg2 {
    public static void main(String[] args) {

        CellPhone obj = new CellPhone();

        obj.ring();
        obj.vibrate();
        obj.callFriend();

    }
}

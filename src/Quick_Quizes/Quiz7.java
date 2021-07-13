// Create class animal and derive the class of dog

package Quick_Quizes;

class  animal{

    public String wild_animal;

    public String domestic_animal;

    public String getWild_animal() {
        return wild_animal;
    }

    public void setWild_animal(String wild_animal) {
        this.wild_animal = wild_animal;
    }

    public String getDomestic_animal() {
        return domestic_animal;
    }

    public void setDomestic_animal(String domestic_animal) {
        this.domestic_animal = domestic_animal;
    }
}
class dog extends animal{

    public String bark;

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
}

public class Quiz7 {
    public static void main(String[] args) {
        animal a1 =new animal();
        a1.setDomestic_animal("Dog,cat are domestic animals you can treat them well");
        System.out.println(a1.getDomestic_animal());
        System.out.println();

        dog dg = new dog();
        dg.setDomestic_animal("Dog is domestic animal");
        System.out.println(dg.getDomestic_animal());

        dg.setBark("Bow Bow....");
        System.out.println(dg.getBark());


    }
}

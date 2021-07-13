package com.company;

interface bike_blueprint { // interface
    int bike_cost = 80000; // Interface property

    void apply_break(int decrement);

    void speedup(int increment);
}

interface bike_model {
    void bike_model(String s);

}

class bike implements bike_blueprint, bike_model { // implement interface
    @Override
    public void apply_break(int decrement) {
        System.out.println("Applying break");
    }

    @Override
    public void speedup(int increment) {
        System.out.println("Speed up Bike");
    }

    @Override
    public void bike_model(String s) {
        System.out.println("new bike model of hond coming soon");
    }
}


public class No_32_Interface {
    public static void main(String[] args) {

        bike b1 = new bike();
        b1.apply_break(5);
        b1.speedup(65);
        b1.bike_model("Hero Honda");

        // we can print interface properties
        System.out.println(b1.bike_cost);

//        but we can't modify interface properties
//        b1.bike_cost = 65;
        System.out.println(b1.bike_cost);
    }
}

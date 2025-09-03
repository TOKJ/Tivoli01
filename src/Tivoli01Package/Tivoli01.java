package Tivoli01Package;

public class Tivoli01 {
    private String name;
    private int height;



    public Tivoli01(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public static void createRider() {
        //Scanner input = new Scanner(System.in);
        Tivoli01 r1 = new Tivoli01("First Ride",130);
        System.out.println(r1.name + " has a minimum height requirement of " + r1.height + " cm.");
    }
}
package Tivoli01Package;
import java.util.Scanner;

public class TivoliTest01 {
    public static void main(String[] args) {
        checkHeight();
    }






    public static void checkHeight() {
        Person01 p1 = new Person01(120);
        Tivoli01 r1 = new Tivoli01("First Ride",130);
        if(p1.personHeight >= r1.height) {
            System.out.println("You are tall enough to go on this ride. Have fun!");
        } else {
            System.out.println("Still not tall enough. Try again text year.");
        }

    }



}

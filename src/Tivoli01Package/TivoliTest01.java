package Tivoli01Package;
import java.util.Scanner;

public class TivoliTest01 {
    public static void main(String[] args) {
        checkHeight();
    }


    public static void checkHeight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in centimeters: ");
        int personHeight = input.nextInt();

        Person01 p1 = new Person01(personHeight);
        Tivoli01 r1 = new Tivoli01("First Ride",130);

        if(p1.personHeight >= r1.height) {
            System.out.println("You are tall enough to go on this ride. Have fun!");
        } else {
            System.out.println("Still not tall enough. Try again text year.");
        }

    }



}

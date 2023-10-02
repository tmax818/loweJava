package book2.ch8;

import java.util.*;

public class GetInteger {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int i = GenAnInteger();
        System.out.printf("You entered %d", i);
    }

    public static int GenAnInteger() {
        while (true){
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("What are you trying to pull, Bro?");
                System.out.println("Try again: ");
            }
        }
    }

}

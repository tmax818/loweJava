package book2.ch8;

public class DivideByZero {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Oops, can't divide by zero");
            System.out.println(e.getMessage());
        }
    }
    
}

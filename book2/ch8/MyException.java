package book2.ch8;

public class MyException {

    public static void main(String[] args) {
        
        try {
            doSomething(true);
        } catch (Exception e) {
            System.out.println("Oh no!!!");
            System.out.println(e.getMessage());
        }
    }

    public static void doSomething(boolean t) throws Exception{

        if(t) throw new Exception("What the fuck!!!");
      
    
}
}

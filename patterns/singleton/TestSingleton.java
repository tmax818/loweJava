package patterns.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();

        if(s1 == s2){
            System.out.println("The objects are the same");
        } else {
            System.out.println("The objects are not the same");
        }
    }
}

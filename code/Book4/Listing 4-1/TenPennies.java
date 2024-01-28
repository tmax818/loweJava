public class TenPennies
{
    public static void main (String[] args)
    {
        System.out.println("Welcome to the New Math..."
            + "Or, Why Java Can't Add\n");
        double penny = 0.01;          // this is a penny
        double dime = 0.10;           // this is a dime

        double tenPennies = 0;
        for (int i = 0; i < 10; i++)  // add up 10 pennies
            tenPennies += penny;

        System.out.println("A penny is " + penny);
        System.out.println("A dime is " + dime);
        System.out.println("Ten pennies are " +
            tenPennies);

        if (tenPennies == dime)
            System.out.println(
                "Ten pennies are equal to a dime.");
        else
            System.out.println(
                "Ten pennies are NOT equal to a dime!");
    }
}

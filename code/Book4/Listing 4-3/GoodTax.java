import java.text.*;
import java.math.*;
import java.util.*;

public class GoodTax
{
    static Scanner sc = new Scanner(System.in);
    static NumberFormat cf
        = NumberFormat.getCurrencyInstance();

    public static void main (String[] args)
    {
        BigDecimal subTotal, salesTax, invoiceTotal;
        BigDecimal taxRate = new BigDecimal("0.05");

        System.out.println("Welcome to the sales tax calculator.");

        do
        {
            System.out.print("\nEnter subtotal: ");

            subTotal = new BigDecimal(sc.nextLine());
            salesTax = subTotal.multiply(taxRate);
            salesTax = round(salesTax);
            invoiceTotal = subTotal.add(salesTax);

            System.out.println("Subtotal:   " + cf.format(subTotal));
            System.out.println("Sales tax:  " + cf.format(salesTax));
            System.out.println("Total:      " + cf.format(invoiceTotal));
        } while (getAnother());
    }

    static BigDecimal round(BigDecimal d)
    {
        return d.setScale(2, RoundingMode.HALF_UP);
    }

    static boolean getAnother()
    {
        System.out.print("\nAgain? (Y or N) ");
        if (sc.nextLine().equalsIgnoreCase("Y"))
            return true;
        else
            return false;
    }
}

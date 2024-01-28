import java.util.*;

public class Towers
{

    static int count = 5;
    static int moves = 0;

    public static void main(String[] args)
    {

        SolveTowers(count, "A", "B", "C");
        System.out.println("The solution required " + moves + " moves.");

    }

    public static void SolveTowers(int count, String from, String temp,
                                   String to)
    {
        if (count == 1)
        {
            System.out.println("Disk 1 from " + from + " to " + to);
            moves++;
        }
        else
        {
            SolveTowers(count - 1, from, to, temp);
            System.out.println("Disk " + count + " from " + from +
                               " to " + to);
            SolveTowers(count - 1, temp, from, to);
            moves++;
        }
    }
}

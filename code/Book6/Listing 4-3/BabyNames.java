import java.io.*;
import java.util.*;

public class BabyNames
{
    public static void main(String[] args)
    {
        BabyName[] names = ReadBabyNames("C:\\Names\\names\\yob2021.txt");
        System.out.println("Read " + names.length + " names.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter END at any time to exit.");

        String searchName = "";
        String searchGender = "";
        String endToken = "END";

        while (!searchName.equals(endToken))
        {
            System.out.print("Enter a name: ");
            searchName = sc.nextLine();
            if (!searchName.equals(endToken))
            {
                BabyName bn = FindName(searchName, names);
                if (bn != null)
                {
                    System.out.println(searchName + " was used "
                        + bn.Count + " times.");
                }
                else
                {
                    System.out.println(searchName + " is not in the database.");
                }
            }
        }
    }

    public record BabyName(String Name, String Gender, int Count){}

    public static BabyName FindName(String searchName, BabyName[] nameList)
    {
        BabyName bn;
        searchName = searchName.toLowerCase();
        int low = 0;
        int high = nameList.length;
        int mid;
        int compare = 0;;
        int steps = 0;

        do
        {
            steps++;

            mid = (low + high) / 2;
            bn = nameList[mid];
            compare = bn.Name.toLowerCase().compareTo(searchName);

            if (compare == 0)
            {
                System.out.println("Found in " + steps + " steps.");
                return bn;
            }
            else
            {
                if (compare < 0)
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
        } while (low <= high);
        System.out.println(steps + " required to eliminate the search name.");
        return null;
    }

    public static BabyName[] ReadBabyNames(String path)
    {

        String line = "";
        String[] data;
        String name;
        String gender;
        int count;

        LinkedList<BabyName> nameList = new LinkedList<BabyName>();

        try
        {
            File f = new File(path);
            BufferedReader rdr = new BufferedReader(new FileReader(f));


            while (line != null)
            {
                line = rdr.readLine();
                if (line != null)
                {

                    data = line.split(",");
                    name = data[0];
                    gender = data[1];
                    count = Integer.parseInt(data[2]);
                    BabyName bn = new BabyName(name, gender, count);
                    nameList.add(bn);
                }
            }
            rdr.close();
        }
        catch (Exception ex)
        {
            System.out.println("Error reading file.");
            System.exit(0);
        }
        BabyName[] returnArray = new BabyName[nameList.size()];
        return nameList.toArray(returnArray);
    }
}
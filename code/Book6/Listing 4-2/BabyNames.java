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
                    System.out.println(searchName
                                       + " is not in the database.");
                }
            }
        }
    }

    public record BabyName(String Name, String Gender, int Count){}


    public static BabyName FindName(String searchName, BabyName[] nameList)
    {
        BabyName bn;
        searchName = searchName.toLowerCase();

        for (int i = 0; i < nameList.length; i++)
        {
            bn = nameList[i];
            if (bn.Name.toLowerCase().equals(searchName))
            {
                System.out.println("Found in " + i + " steps.");
                return bn;
            }
        }
        return null;
    }


    public static BabyName[] ReadBabyNames(String path)
    {

        String line = "";
        String[] data;
        String name;
        String gender;
        int count;

        ArrayList<BabyName> nameList = new ArrayList<BabyName>(30000);

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

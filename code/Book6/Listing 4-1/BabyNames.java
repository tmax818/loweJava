import java.io.*;
import java.util.*;

public class BabyNames
{
    public static void main(String[] args)
    {
        BabyName[] names = ReadBabyNames("yob2021.txt");
        System.out.println("Read " + names.length + " names.");
    }

    public record BabyName(String Name, String Gender, int Count){}

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

import java.net.http.*;
import java.net.http.HttpResponse.*;
import java.net.http.HttpRequest.*;
import java.net.URI;
import java.util.Scanner;

public class HttpTester
{
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);

        HttpClient client = HttpClient.newHttpClient();

        System.out.println("Welcome to the URI tester.\n");
        System.out.println("Enter exit to quit.\n");

        while (true)
        {
            System.out.print("Enter a URI: ");
            String input = sc.nextLine();

            if (input.toLowerCase().startsWith("exit"))
                System.exit(0);

            try
            {
                HttpRequest request = HttpRequest.newBuilder()
                  .uri(new URI(input))
                  .GET()
                  .build();

                  HttpResponse<String> response =
                          client.send(request, BodyHandlers.ofString());

                if (response.statusCode() == 200)
                {
                    System.out.println(response.body() + "\n");
                }
                else
                {
                    System.out.println("Error: status = "
                        + response.statusCode()
                        + "\n");
                }
            }

            catch (IllegalArgumentException ex)
            {
                System.out.println("That is not a valid URI.\n");
            }
        }
    }
}

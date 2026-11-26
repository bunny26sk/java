
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadWebPage {

    public static void main(String[] args) {

        try {
            // Create URL object
            URL url = new URL("https://example.com");

            System.out.println("Connecting to website...");
            System.out.println("Website: " + url);

            // Read webpage content
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            url.openStream(),
                            StandardCharsets.UTF_8))) {

                String line;

                System.out.println("\n----- Web Page Content -----\n");

                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

                System.out.println("\n----- Reading Completed -----");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

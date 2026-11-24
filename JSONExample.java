
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileWriter;
import java.io.FileReader;

public class JSONExample {

    public static void main(String[] args) {

        try {

            // Step 1: Create a JSON Object
            JSONObject student = new JSONObject();

            student.put("id", 101);
            student.put("name", "Arun");
            student.put("department", "Computer Science");
            student.put("age", 20);
            student.put("college", "ABC College");

            // Step 2: Write JSON data into a file
            FileWriter writer = new FileWriter("student.json");

            writer.write(student.toJSONString());
            writer.close();

            System.out.println("JSON file created successfully!");

            // Step 3: Read JSON data from file
            FileReader reader = new FileReader("student.json");

            // Step 4: Parse JSON data
            JSONParser parser = new JSONParser();

            JSONObject jsonObject =
                (JSONObject) parser.parse(reader);

            reader.close();

            // Step 5: Display JSON data
            System.out.println("\nJSON Data:");

            System.out.println("ID: " +
                jsonObject.get("id"));

            System.out.println("Name: " +
                jsonObject.get("name"));

            System.out.println("Department: " +
                jsonObject.get("department"));

            System.out.println("Age: " +
                jsonObject.get("age"));

            System.out.println("College: " +
                jsonObject.get("college"));

        }

        catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}


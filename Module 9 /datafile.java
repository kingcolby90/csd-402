import java.io.*;
import java.util.Random;

public class datafile {

    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        try (FileWriter writer = new FileWriter(file, true)) { 
            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100); 
                writer.write(number + " ");
            }
            writer.write("\n"); 
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Contents of data.file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(">> " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
package q1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q1 {
    public static void main(String[] args)  {
        try(BufferedReader reader = new BufferedReader(new FileReader("src\\q1\\sample.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            }catch(IOException e) {
                e.printStackTrace();
            }
    }
}

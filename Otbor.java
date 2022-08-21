import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Otbor {

    public static void main(String[] args) throws IOException {
        CSVReader reader = new CSVReader(new FileReader("f1_.csv"),',','"',1);
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                //Verifying the read data here
                System.out.println(Arrays.toString(nextLine));

            }
        }
    }
}

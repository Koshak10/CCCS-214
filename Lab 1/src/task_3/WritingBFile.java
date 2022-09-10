import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingBFile {

    public static void main(String[] args) throws IOException {
        // An array to write to the file
        int[] numbers = {3, 5, 7, 9, 11, 13, 15};
        // Create the binary output objects.
        // complete here
        FileOutputStream fstream = new FileOutputStream("Num.dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);

        System.out.println("Writing the numbers to the file...");

        // Write the array elements to the file.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("writing: " + numbers[i]);
            // complete
            outputFile.writeInt(numbers[i]);
        }
        System.out.println("Done.");
        // Close the file.
        // complete
        outputFile.close();
    }

}

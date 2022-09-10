import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingBFile {

    public static void main(String[] args) throws IOException {
        int number; // A number read from the file
        boolean endOfFile = false; // EOF flag

        // Create the binary file input objects.
        // Complete
        FileInputStream fstream = new FileInputStream("Num.dat");
        DataInputStream inputFile = new DataInputStream(fstream);

        // Read the contents of the file.
        while (!endOfFile) {
            try { // Complete
                number = inputFile.readInt();
                System.out.print(number + " ");
            } catch (EOFException e) {
                endOfFile = true;
            }
        }
        System.out.println("\nDone.");
        // Close the file.
        // Complete
        inputFile.close();
    }
}

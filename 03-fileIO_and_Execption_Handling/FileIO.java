import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * File I/O Exercise:
 * 
 * Write a Java program that reads data from a text file named input.txt and
 * writes it to a new file named output.txt. Ensure that the program handles
 * exceptions properly and closes the file streams after use.
 */

public class FileIO {
    public static void main(String[] args) {
        byte[] data = getFileInput();
        writeFile(data);
    }

    static byte[] getFileInput() {
        byte[] data = new byte[] { 0 };

        Path path = Paths.get("input.txt");
        try (var inputStream = Files.newInputStream(path)) {
            data = inputStream.readAllBytes();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return data;
        }
    }

    static void writeFile(byte[] input) {
        Path path = Paths.get("output.txt");
        try (var fileWriter = Files.newOutputStream(path)) {
            fileWriter.write(input);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
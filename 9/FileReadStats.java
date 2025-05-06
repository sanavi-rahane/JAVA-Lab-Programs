import java.io.FileInputStream;
import java.io.IOException;

public class FileReadStats {
    public static void main(String[] args) {
        FileInputStream fis = null;
        int charCount = 0;
        int wordCount = 0;

        try {
            fis = new FileInputStream("\"D:\\NpKey.txt\""); // Make sure this file exists
            StringBuilder sb = new StringBuilder();
            int ch;

            // Read characters from the file
            while ((ch = fis.read()) != -1) {
                sb.append((char) ch);
                charCount++;
            }

            // Convert to String and split by whitespace to count words
            String content = sb.toString().trim();
            if (!content.isEmpty()) {
                wordCount = content.split("\\s+").length;
            }

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}

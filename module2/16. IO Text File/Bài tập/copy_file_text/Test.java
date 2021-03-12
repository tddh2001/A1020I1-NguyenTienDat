package copy_file_text;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //input
            BufferedReader reader = new BufferedReader(new FileReader(new File("src/copy_file_text/Test1.txt")));
        //output
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/copy_file_text/Test.txt"),true));
        //Sao chep file tu Test1.txt sang copy_file_text.Test.txt
            String line;

                while ((line = reader.readLine()) != null) {
                    writer.newLine();
                    writer.write(line);
                }

            reader.close();
            writer.close();
    }
}

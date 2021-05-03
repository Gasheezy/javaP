import java.io.Writer;
import java.io.FileWriter;

class fileWriter {
    public static void main(String[] args) {
        String data = "This is the data to be in the output file";

        try{
            //creates a writer using FileWriter
            Writer output = new FileWriter("output.txt");

            //writes string to the file
            output.write(data);

            //close the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
import java.io.FileReader;
import java.io.Reader;

class fileReader {
    public static void main(String[] args) {
        //creates an array of character
        char[] array = new char[100];

        try{
            //creates a reader using a filereader
            Reader input = new FileReader("input.txt");

            //checks if reader is ready
            System.out.println("Is there data in the stream? " +input.ready());

            //reads characters
            input.read(array);
            System.out.println("Data in the stream: ");
            System.out.println(array);

            input.close();
        }
        catch (Exception e) {
            //TODO: handle exception
            e.getStackTrace();
        }
    }
}

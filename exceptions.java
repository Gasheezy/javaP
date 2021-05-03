import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

class exceptions{
    //decalring the type of exception
    public static void findFile() throws IOException{

        //code that may generate IOException
        File newFile = new File("text.txt");
        FileInputStream stream = new FileInputStream (newFile);
    }

    public static void main(String[] args) {
        try{
            findFile();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
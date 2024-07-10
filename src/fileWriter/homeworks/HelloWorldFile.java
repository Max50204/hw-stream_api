package fileWriter.homeworks;


import java.io.FileWriter;
import java.io.IOException;


public class HelloWorldFile {
    public static void main(String[] args)throws IOException {

        String content = "Hello World";
        FileWriter writer = null;


        try { writer = new FileWriter("output.txt");
            writer.write(content);
            System.out.println("Done");

        } catch( IOException e){
            e.printStackTrace();
        }
finally {
            writer.close();
        }
    }
}

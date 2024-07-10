package fileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
       String s = "Viele Jahre\n";
       String s1 = "viel Geld bekommen!\n";
       FileWriter writer = null;
       try{
           writer = new FileWriter("test2.txt",true);
           writer.write(s1);
           System.out.println("Done!");
       } catch (IOException e){
           e.printStackTrace();
       }
       finally {
           writer.close();
       }
    }
}

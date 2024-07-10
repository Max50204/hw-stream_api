package fileWriter.homeworks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    public class HalloWeltFile {
        public static void main(String[] args) {
            String content = "Hallo Welt!";
            String filePath = "output.txt";

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                writer.write(content);
                System.out.println("Строка записана в файл: " + filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

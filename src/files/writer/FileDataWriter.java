package files.writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataWriter {

    public static void writeDataToFile(String text, Path filePath) {
        try{
            Files.write(filePath, text.getBytes());
        } catch (IOException e) {
             e.printStackTrace();
        }

    }

    public static String readDataFromFile(Path path){

        String data = null;
        try {
            data = new String(Files.readAllBytes(path));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(data);
        return data.trim();

    }


    public static String deleteDataFromFile(Path path) {

        try {
            Files.delete(path);
        } catch (IOException e) {
           e.printStackTrace();
        }
        return "";

    }

    public static String updateDataInAFile(Path path, String text){

        String data = null;
        try {
            data = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newData = data + " " + text;
        FileDataWriter.writeDataToFile(newData, path);
        System.out.println(newData);

        return newData;
    }

    public static int countNumberOfWordsInAFile(Path path) {

        String value = "";
        String data = "";
        try {
            data = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String newData = data.trim();
        String [] array = newData.split("");
        for(String values : array){
            if (values.matches("[A-z0-9]")) {
                value += values;
            }
        }
       

        return value.length();
    }

    aToFile(String text, String fileLocation){
        try (FileOutputStream outputStream = new FileOutputStream(fileLocation)) {

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}




































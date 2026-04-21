package files.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {
    public static void main(String[] args) {
        try{
            String directory = "/home/odili/Desktop/Project/String/src/files/output";

            Path path = Path.of(directory, "flash.txt");
            System.out.println("filePath :: " + path);

            Files.createDirectories(path);

        }catch (IOException exception){
            System.err.println(exception.getMessage());
            exception.printStackTrace();
        }

    }
}

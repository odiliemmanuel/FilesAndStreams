import files.writer.FileDataWriter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class FileDataWriterTest {

    @Test
    public void testCanWriteTextToFile(){
        try{
            String fileLocation = "/home/odili/Desktop/Project/String/src/files/output/numbers.txt";
            Path path = Paths.get(fileLocation);
            String text = """
                10, 100, 1000""";
            FileDataWriter.writeDataToFile(text, path);
            String dataReadFromFile = Files.readString(path);
            assertEquals(text, dataReadFromFile);
        }
        catch(IOException exception){
            exception.printStackTrace();
        }

    }


    @Test
    public void testThatICanReadFromFile(){
        String fileLocation = "/home/odili/Desktop/Project/String/src/files/output/numbers.txt";
        Path path = Paths.get(fileLocation);

        String readData = FileDataWriter.readDataFromFile(path);
        System.out.println(readData);

        assertEquals("10, 100, 1000", readData);

    }

    @Test
    public void testThatICanDeleteFromAAFile(){
        String fileLocation = "/home/odili/Desktop/Project/String/src/files/output/numbers.txt";
        Path path = Paths.get(fileLocation);


        assertEquals("", FileDataWriter.deleteDataFromFile(path));
    }

    @Test
    public void testThatICanUpdateDataFromFile(){
        try{
            String fileLocation = "/home/odili/Desktop/Project/String/src/files/output/numbers.txt";
            Path path = Paths.get(fileLocation);

            String text = """
                20, 200, 2000""";
            String data = FileDataWriter.updateDataInAFile(path, text);
            assertEquals(data, "10, 100, 1000 20, 200, 2000");
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void testThatICanCountNumberOfWordsInAFile(){
        String fileLocation = "/home/odili/Desktop/Project/String/src/files/output/numbers.txt";
        Path path = Paths.get(fileLocation);

        assertEquals(18, FileDataWriter.countNumberOfWordsInAFile(path));

        System.out.println(FileDataWriter.countNumberOfWordsInAFile(path));
    }
}

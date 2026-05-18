import java.io.DataInputStream;
import java.io.IOException;

public class ConsoleDataReader {

    public static String readData(){
        try(DataInputStream dataInputStream = new DataInputStream(System.in)){
            StringBuilder data =  new StringBuilder();
            return dataInputStream.readLine();
        } catch (IOException e){
            throw new RuntimeException(":(");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter data to be processed: ");
        System.out.println(readData());
    }
}

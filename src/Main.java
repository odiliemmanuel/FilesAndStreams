import java.nio.file.Path;
import java.nio.file.Paths;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String fileLocation = "/a/b/c/../e/f";
        Path path = Paths.get(fileLocation);

        System.out.println(path.getFileSystem());
        System.out.println(path);


    }

}
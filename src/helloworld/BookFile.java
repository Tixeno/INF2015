package helloworld;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class BookFile {
    static public void read() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        String path = "src/helloworld/mesLivres.txt";
        char[] fullSizeBuffer = new char[(int) new File(path).length()];
        FileInputStream inputStream = new FileInputStream(path);
        InputStreamReader inputReader = new InputStreamReader(inputStream, "UTF-8");
        inputReader.read(fullSizeBuffer);
        String content = new String(fullSizeBuffer);
        System.out.println(content.trim());
    }
}


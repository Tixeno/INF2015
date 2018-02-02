package netbeans;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import static netbeans.Utf8File.loadFileIntoString;

public class BookFile {
    static public void read() throws FileNotFoundException, UnsupportedEncodingException, IOException{
        String meslivres = loadFileIntoString("C:\\Users\\Tixeno\\Documents\\NetBeansProjects\\NetBeans\\src\\netbeans\\mesLivres.txt");
        System.out.println(meslivres);
    }
}

//Test
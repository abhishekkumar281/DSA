import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReadWrite {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:\\java\\abhii.txt");
            FileWriter fw = new FileWriter("D:\\java\\abhiiyadav.txt");
            String str = " ";
            int i;
            while ((i = fr.read()) != -1) {
                str += (char) i;
            }
            fw.write(str);
            fr.close();
            fw.close();
            System.out.println(str);
        }
       catch (Exception e){
            System.out.println(e);
        }
    }
}

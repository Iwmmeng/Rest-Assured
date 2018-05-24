import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("/Users/huamiumiu/code/file","1.txt");
        File f2 = new File("/Users/huamiumiu/code/file","2.txt");
        File f3 = new File("/Users/huamiumiu/code/file","3.txt");
        File f4 = new File("/Users/huamiumiu/code/file");
        try {
            f1.createNewFile();
            f2.createNewFile();
            f3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File [] ff = f4.listFiles();

        for(int i=0;i<ff.length;i++){
            System.out.println("file name :" + ff[i]);
        }


    }
}

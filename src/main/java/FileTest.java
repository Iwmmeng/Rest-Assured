import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Users/huamiumiu/code/file","1.txt");
        File f2 = new File("/Users/huamiumiu/code/file","2.txt");
        File f3 = new File("/Users/huamiumiu/code/file","3.txt");
        File f4 = new File("/Users/huamiumiu/code/file");
//        try {
//            f1.createNewFile();
//            f2.createNewFile();
//            f3.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        File [] ff = f4.listFiles();

//        for(int i=0;i<ff.length;i++){
//            System.out.println("file name :" + ff[i]);
//        }

//强转会发生什么？？？？
            FileInputStream fileInputStream = new FileInputStream (f1);
            //这个变量i在哪里体现了呢？？i的增长代表了什么？？？
        for(int i=0;i<f1.length();i++){
            char ch =(char)  fileInputStream.read();
            System.out.println(ch);
        }



    }
}

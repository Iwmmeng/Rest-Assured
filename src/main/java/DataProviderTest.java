//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class DataProviderTest {
////    @DataProvider
////    public Object[][] getData(){
////        Object[][] objects={
////                {"aaa","111"},
////                {"bbb","222"},
////                {"ccc","333"}
////        };
////        return objects;
////    }
//    @DataProvider
//    public Iterator<Object[]> getData(){
//        String path = this.getClass().getResource("data.csv").getPath();
//        System.out.println(path);
//        return readDataFromCSV(path);
//    }
//
//    @Test(dataProvider = "getData")
//    public void dataTest(String username,String pwd){
//        System.out.println(username);
//        System.out.println(pwd);
//    }
//
//
//    public Iterator<Object[]> readDataFromCSV(String path){
//        List<Object[]> list = new ArrayList<>();
//        try{
//            FileReader fileReader = new FileReader(new File("/Users/huamiumiu/code/Rest-Assured/src/main/resources/data.csv"));
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            bufferedReader.readLine();
//
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//
//
//
//
//}

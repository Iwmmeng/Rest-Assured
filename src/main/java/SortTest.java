import java.util.Arrays;

/**
 * @author wangmeng
 * @date 18/7/3
 */
public class SortTest {
    public static void main(String[] args) {
//        int[] a=new int[]{2,34,21,11,23,56,65,33,89,90};
//        //创建数组对象a07
//        Arrays.sort(a);
        Stu stu1 = new Stu("张三");
        Stu stu2 = new Stu("李四");
        Stu stu3 = new Stu("王五");

        stu1.set("张三",7);
        stu2.set("李四",2000);
        stu3.set("王五",33);

        Stu[] stuArr = {stu1,stu2,stu3};

        Arrays.sort(stuArr);

        for(int i=0;i<stuArr.length;i++){
            System.out.println(stuArr[i]);
        }
    }
}

class Stu implements Comparable {
    String name ;
    int age;
    public void set(String name,int age){
        this.name = name;
        this.age=age;
    }
    Stu(String name) {
        //带参构造函数14
         this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Stu st = (Stu) o;
        return (age-((Stu) o).age);
    }
    @Override
    public String toString(){
        return "name" + name +"age"+age;
    }

}

public class ExtendsTest {
    public void run(){
        System.out.println("父类方法");
    }
}



class SonClass extends ExtendsTest {

    @Override
    public void run(){
        System.out.println("zi类 run方法");
    }

    public void eat() {
        System.out.println("子类方法");
    }
}

class Verify {
    public static void main(String[] args) {
//        SonClass sonClass = (SonClass) new ExtendsTest();
        ExtendsTest extendsTest = new SonClass();
        SonClass sonClass1 = (SonClass)extendsTest;
        extendsTest.run();
//        sonClass.eat();
//        sonClass.run();

    }
}

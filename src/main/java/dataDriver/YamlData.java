package dataDriver;

public class YamlData {
    public int getReal1() {
        return real1;
    }

    public void setReal1(int real) {
        this.real1 = real;
    }
    public int getReal2() {
        return real2;
    }

    public void setReal2(int real) {
        this.real2 = real;
    }

    private int real1;
    private int real2;

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    private String expect;
}

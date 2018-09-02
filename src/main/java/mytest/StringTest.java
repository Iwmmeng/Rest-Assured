package mytest;

import java.util.ArrayList;
import java.util.List;

public class StringTest {
    public static void main(String[] args) {
        judgeIp("0.111.3.2");

    }

    public static boolean judgeIp(String ip) {
        String[] strings = (ip.split("\\."));
        for (String object : strings) {
            System.out.println(object);
        }
        if (strings.length == 4) {
            for (int i = 0; i < strings.length; i++) {
                int ipint = Integer.valueOf(strings[i]);
                if ((ipint < 0) || (ipint > 255)) {
                    System.out.println("ip out of range");
                    return false;
                }
            }
            return true;
        } else {
            System.out.println("ip input error=========");
            return false;
        }
    }



}

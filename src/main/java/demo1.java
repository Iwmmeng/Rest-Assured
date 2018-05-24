import org.junit.Test;
import static io.restassured.RestAssured.*;
import    static    io.restassured.matcher.RestAssuredMatchers.*;
import     static   org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class demo1 {
    @Test
     public void test1(){
        Map map = new HashMap();
//        map.put("wfr","pc");
//        map.put("fr","idx_sl");
//        map.put("context","%7B%22nid%22:%22news_9417375769693314374%22%7D");
        map.put("testhome","testhome");

        useRelaxedHTTPSValidation();
         given().queryParams(map)
                 .when().get("https://mbd.baidu.com/newspage/data/landingshare").prettyPeek()
                 .then()
                       .statusCode(200)
                       .body("html.head.title",equalTo("特斯拉 Model 3 中国首秀，我们替你进车里坐了坐"))
        ;
    }

    @Test
    public void test2(){
        Map map = new HashMap();
//        map.put("wfr","pc");
//        map.put("fr","idx_sl");
//        map.put("context","%7B%22nid%22:%22news_9417375769693314374%22%7D");
//        map.put("testhome","testhome");

        useRelaxedHTTPSValidation();
        given()
                .when().get("https://www.baidu.com").prettyPeek()
                .then()
                .statusCode(200)
                .body("html.head.title",equalTo("百度一下，你就知道"))
        ;
    }
}

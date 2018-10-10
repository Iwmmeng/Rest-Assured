package restAPI;

import com.jayway.jsonpath.JsonPath;
import io.restassured.config.JsonConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.path.json.config.JsonPathConfig;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.openqa.selenium.json.Json;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

import static io.restassured.RestAssured.*;
import    static    io.restassured.matcher.RestAssuredMatchers.*;
import     static   org.hamcrest.Matchers.*;

public class APITest1 {

    @Test
    public void test1(){
        Map map = new HashMap();
        map.put("limit","3");
        map.put("offset","0");
        map.put("type","last_actived");
        useRelaxedHTTPSValidation();

        String result = given()
                .queryParams(map).when().get("https://testerhome.com/api/v3/topics.json").asString();
        System.out.println("result"+result);
        JSONObject jsonObject = JSONObject.fromObject(result);
        System.out.println("jsonObject"+jsonObject);
        JSONArray jsonArray = JSONArray.fromObject(jsonObject.get("topics"));

        List<String> list= JsonPath.read(result,"$.topics[*].user.login");
        for(int j=0;j<list.size();j++){
            System.out.println("=============");
            System.out.println(list.get(j));
        }

        for(int i = 0;i<jsonArray.size();i++){

            System.out.println(JSONObject.fromObject(JSONObject.fromObject(jsonArray.get(i)).get("user")).get("login"));
        }
    }
    //https://testerhome.com/api/v3/topics.json?limit=20
    // 从这个接口中找出来title是“美团技术沙龙北京站：千万级日活 App 的质量保证”的作者
    @Test
    public void test2(){
        useRelaxedHTTPSValidation();
        given().get("https://testerhome.com/api/v3/topics.json?limit=20")
                .then()
                .statusCode(200)
                .body("topics.find { it.title == '美团技术沙龙北京站：千万级日活 App 的质量保证'}.user.login ",
                        equalTo("mtdptech"));
    }


//Request URL: https://stock.xueqiu.com/v5/stock/batch/quote.json?symbol=SH000001,SZ399001,SZ399006,HKHSI,HKHSCEI,HKHSCCI,.DJI,.IXIC,.INX
//Cookie: xq_a_token=9c75d6bfbd0112c72b385fd95305e36563da53fb; xq_a_token.sig=-6-bcHntQlhRjsyrvsY2IGwh-B4; xq_r_token=9ad364aac7522791166c59720025e1f8f11bf9eb; xq_r_token.sig=usx1_hrblByw-9h0cXk1yLIUlL4; u=821537071581960; Hm_lvt_1db88642e346389874251b5a1eded6e3=1537071582; Hm_lpvt_1db88642e346389874251b5a1eded6e3=1537071582; device_id=2f8dd8c475cd6cdefbe4baedae847fc8; _ga=GA1.2.666709527.1537071583; _gid=GA1.2.665750474.1537071583; _gat_gtag_UA_16079156_4=1
    @Test
    public void test3() {
        useRelaxedHTTPSValidation();
        Map<String, String> map = new HashMap<>();
        String string = "SH000001,SZ399001,SZ399006,HKHSI,HKHSCEI,HKHSCCI,.DJI,.IXIC,.INX";
        map.put("symbol", string);

        String[] stringList = string.split(",");
        for (String str : stringList
                ) {
            System.out.println(str);
        }
        given()
                .config(RestAssuredConfig.config().jsonConfig(JsonConfig.jsonConfig().numberReturnType(JsonPathConfig.NumberReturnType.DOUBLE)))
                .queryParams(map)
                .cookie("xq_a_token=9c75d6bfbd0112c72b385fd95305e36563da53fb")
                .get("https://stock.xueqiu.com/v5/stock/batch/quote.json").prettyPeek()
                .then()
                .statusCode(200)
                .body("data.items.size()", equalTo(stringList.length))
        .body("data.items.quote.findAll{it.symbol=='SH000001'}.size()",equalTo(1))
        .body("data.items.quote.find{it.symbol=='SH000001'}.symbol",equalTo(stringList[0]))
        ;
        // TODO: 2018/9/16 怎么可以用一个模板来验证这里面所有的项呢？或者用一个循环来逐个验证这里面的参数和返回值呢？
        // 1. 逐个的验证，代码量很大
        // 2. body 中语法的校验，有什么好的调试方法吗？在字符串里面引用，不知道到底哪里写的对或者不对


    }



}

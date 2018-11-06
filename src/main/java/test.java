import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static io.restassured.path.json.JsonPath.from;
//import static org.hamcrest.Matchers.*;
//import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class test {
	
	
//	@BeforeClass
	public static void setSSL() {
		//设置默认跳过ssl验证
		RestAssured.useRelaxedHTTPSValidation();
	}
	
//	@Test
//	public void gettest1() {		
//		
//		Map< String,Object> map = new HashMap<String,Object>();
//		map.put("topicid", 12192);
//		map.put("topics", "topics");
//	    get("https://testerhome.com/{topics}/{topicid}",map).prettyPeek();
//		
//	}
//	
//	@Test
//	public void gettest2() {
//		
//		get("https://testerhome.com/{topics}/{topicid}","topics",12192).prettyPeek();
//		
//	}
//	
//	@Test
//	public void gettest3() {
//		
//		get("https://testerhome.com/topics/12192").prettyPeek();
//		
//	}
	
	
//	@Test
	public void getParam1() {
		Map<String, String> parameters = new HashMap<String, String>();
		 parameters.put("limit", "1");
		 parameters.put("offset", "0");
		 parameters.put("type", "last_actived");
		 given().params(parameters).get("https://testerhome.com/api/v3/topics.json").prettyPeek();
	}
//	
//	@Test
//	public void getParam2() {
//		given().param("limit",1).param("offset", 0)
//		 .param("type", "last_actived").get("https://testerhome.com/api/v3/topics.json").prettyPeek();
//	}
//	
//	@Test
//	public void postbody() {
//		//以body体方式进行传参
//		 given().body("{ \"message\" : \"hello world\"}").get("https://testerhome.com/api/v3/topics.json").prettyPeek();
//	}
	
	
//	@Test
	public void setcookies() {
//		
		given().cookie("username", "xushizaho").get("https://testerhome.com/topics/12192").prettyPeek();
		
		
	}
	
	public void seturlEncoding() {
		given().urlEncodingEnabled(true).cookie("username", "xushizaho").get("https://testerhome.com/topics/12192").prettyPeek();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Object> list = given().get("https://testerhome.com/api/v3/topics.json?limit=2&offset=0&type=last_actived")
//				.jsonPath().getList("topics");
//		System.out.println(list.size());
		
		given().param("user[login]", "test@qq.com").param("user[password]", "111111").param("user[remember_me]", 0)
		.post("https://testerhome.com/account/sign_in").prettyPeek();
//		
//		Map< String,Object> map = new HashMap<String,Object>();
//		map.put("topicid", 12192);
//		map.put("topics", "topics");
//		
//		
////	    given().get("https://testerhome.com/{topics}/{topicid}",map).prettyPeek();
//	    
//	    given().get("https://testerhome.com/{topics}/{topicid}","topics",12192).prettyPeek();
	
	}

}

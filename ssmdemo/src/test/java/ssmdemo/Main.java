package ssmdemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sve.entity.User;
import com.sve.service.UserService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("INSERT INTO USER(NAME,PASSWORD,AGE)"
					+ " VALUES('name"+i+"','password"+i+"',"+i+");");	
		}
		
		
		
		
		
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserService userService = (UserService)ctx.getBean("userService");
//		List<User> users = userService.getAllUser();
//		System.out.println(JSONArray.fromObject(users).toString());
//		User user = (User)ctx.getBean("user");
//		System.out.println(JSONObject.fromObject(user).toString());
		
	}

}

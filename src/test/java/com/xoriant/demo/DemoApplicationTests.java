package com.xoriant.demo;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ModelMap;

import com.xoriant.demo.web.controller.LoginController;
import com.xoriant.demo.web.model.Todo;
import com.xoriant.demo.web.service.TodoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	 @Test
	    public void testApplicationConfiguration() {
	        ApplicationConfiguration config = new ApplicationConfiguration();
	        String result = config.hello();
	        assertEquals("Hello World",result);
	    }
	 
//	 @Test
//	     public void testLoginConfig() {
//	     LoginController config = new LoginController();
//         ModelMap model = null;
//         String result = config.showLoginPage(model);
//         assertEquals("login",result);
//	 }
//	 
//	 @Test
//	     public void testRetrieveTodos() {
//	     TodoService service = new TodoService();
//	     List<Todo> a = service.retrieveTodos("vvk30");
//	     assertEquals(1,a.size());
//	 }
//	 
//	 @Test
//	     public void testTodo() {
//	     Todo t = new Todo(1, "a", "a", new Date(), true);
//	     assertEquals(1,t.getId());
//	     assertEquals("a",t.getDesc());
//	     assertEquals("a",t.getUser());
//	     assertEquals(true,t.isDone());
//	     t.setId(2);
//	     t.setDone(false);
//	     t.setDesc("b");
//	     t.setUser("b");
//	     assertEquals(2,t.getId());
//	     assertEquals(false,t.isDone());
//	     assertEquals("b",t.getDesc());
//         assertEquals("b",t.getUser());
//	     
//	 }

}

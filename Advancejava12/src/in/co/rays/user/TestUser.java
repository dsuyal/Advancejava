package in.co.rays.user;

import java.text.SimpleDateFormat;

public class TestUser {
	public static void main(String[] args)throws Exception {
		
		//testAdd();
		testUpdate();
	}

	private static void testUpdate() throws Exception {
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			UserModel model = new UserModel();
			
			UserBean bean = model.findById(3);      
			
			bean.setFirstName("rahul");
			bean.setLastName("roy");
			bean.setLoginId("rahul@gmail.com");
			
			model.update(bean);
			
		
		
	}

	private static void testAdd()throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		UserBean bean = new UserBean();
		
		bean.setFirstName("Dinesh");
		bean.setLastName("suyal");
		bean.setLoginId("dinesh@gmail.com");
		bean.setPassword("123");
		bean.setAddres("indore");
		bean.setDob(sdf.parse("1988-08-30"));
		bean.setAddres("indore");
		
		UserModel model = new UserModel();
		model.add(bean);
		
		
		
	}

}

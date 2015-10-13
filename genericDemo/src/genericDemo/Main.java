package genericDemo;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		CommonDaoImpl dao = new CommonDaoImpl();
		List<UserPo> allUsers = dao.findAll(UserPo.class);
	}
}

/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestUserDAO dao = new TestUserDAO();
		dao.select("taro", "123");

		dao.selectAll();

		dao.selectByName("taro");

		dao.selectByPassword("123");

		dao.updateUserNameByUserName("hanako", "tanaka");

		dao.insert(4, "shiro", "012");

		dao.delete("shiro");
	}

}

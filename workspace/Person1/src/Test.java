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

		// Person p = new Person1();
		Person1 taro = new Person1();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person1 saburo = new Person1("saburo");
		// saburo.age = 21;
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		Person1 unnamed = new Person1(25);
		System.out.println(unnamed.name);
		System.out.println(unnamed.age);

		Person1 hanako = new Person1("hanako", 17);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}

}

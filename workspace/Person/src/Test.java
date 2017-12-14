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
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "090-0000-0000";
		taro.address = "神奈川";
		taro.birthday = 20170909;
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		System.out.println(taro.birthday);

		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;

		System.out.println(jiro.name);
		System.out.println(jiro.age);

		System.out.println(hanako.name);
		System.out.println(hanako.age);


		Robot aibo = new Robot();
		aibo.name = "AIBO";
		aibo.walk();
		aibo.run();

		Robot pepper = new Robot();
		pepper.name = "ペッパー君";
		pepper.talk();

	}

}

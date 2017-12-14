/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Book {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO 自動生成されたメソッド・スタブ
//		System.out.println("数あてゲーム");
//		int ans = new java.util.Random().nextInt(10);
//		for (int i = 0; i < 5; i++) {
//			System.out.println("0～9を入力してください。");
//			int num = new java.util.Scanner(System.in).nextInt();
//			if (ans == num) {
//				System.out.println("あたり！");
//				break;
//			} else {
//				System.out.println("はずれ！");
//			}
//		}
//		System.out.println("げーむを終了します。");
//
//
//	int[] numbers = new int[] {3, 4, 9};
//
//	System.out.println("1桁の数字を入力してください");
//	int input = new java.util.Scanner(System.in).nextInt();
//	for (int n : numbers) {
//		if (n == input) {
//			System.out.println("あたり");
//		}
//	}
//
//
//	}

	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
		introduceOneself();
		email("hey", "abc@aaa", "hello");
		email("def@ccc", "hey");

		double triangleArea = calcTriangleArea(10.5, 8.0);
		System.out.println(triangleArea);
		double circleArea = calcCircleArea(7);
		System.out.println(circleArea);
	}

	public static void introduceOneself() {
		String name = "tanaka";
		int age = 21;
		double heights = 181.5;
		char sex = '男';
		System.out.println("私の名前は" + name + "、" + age + "歳、" + sex + "性、身長" + heights + "cmです。");
	}

	public static void email(String title, String address, String text) {
		System.out.println("to:" + address);
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}

	public static void email(String address, String text) {
		System.out.println(address);
		System.out.println("本文:" + text);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double area = ((bottom * height) / 2);
		return area;
	}
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

}

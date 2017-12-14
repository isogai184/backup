/**
 *
 */
package object;

/**
 * @author internousdev
 *
 */
public class Myself {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Friend friend = new Friend();
		System.out.println("---友達とのやりとり---");
		friend.borrow();
		friend.talk();

		Friend taro = new Friend();
		System.out.println("---太郎さんとのやりとり---");
		taro.play();
	}

}

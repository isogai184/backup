import java.util.Random;
public class Cleric {

	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;


	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Cleric(String name, int hp) {
		this(name, hp, MAX_MP);
	}
	public Cleric(String name) {
		this.name = name;
		this.hp = MAX_HP;
		this.mp = MAX_MP;
	}
	public void selfAid() {
		System.out.println(name + "はselfaidを唱えた！");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPが最大まで回復した。");
	}
	public int pray(int sec) {
		int recover = new Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した！");
		return recoverActual;
	}
	Cleric() {

	}

}

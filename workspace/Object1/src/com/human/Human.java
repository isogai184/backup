package com.human;

public class Human {

	public static String SEI;
	public static String MEI;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("HelloWorld");


		SEI = "磯貝";
		MEI = "智樹";
		System.out.println(SEI + MEI);

		HumanName humanName = new HumanName();
		System.out.println(humanName.getName());

		String SEI1 = humanName.SEI;
		String MEI1 = humanName.getMEI();
		System.out.println(SEI1 + MEI1);

		HumanName humanName2 = new HumanName("田中", "太郎");
		System.out.println(humanName2.getName());
	}

}

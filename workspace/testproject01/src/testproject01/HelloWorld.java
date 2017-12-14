package testproject01;

public class HelloWorld {

	public static void main(String[] args) {
//		// java-02-05
//		System.out.println("例外が\r\n発生しました。");
//		String name = "高橋";
//		System.out.println(name);
//		char chr1 = 'A';
//		System.out.println(chr1);
//		String abc = "山田";
//		System.out.println(abc + "さん");
//		int a1 = 4+ 3;
//		System.out.println(a1);
//		float a2 = (float)2.5 / 3;
//		System.out.println(a2);

		// java-06
//		int a =10;
//		if (a < 20) {
//			System.out.println("aaaa");
//		}
//		String b = "山田";
//		if (b.equals("山田")) {
//			System.out.println(b + "さん");
//		}
//		int c = 5;
//		if (c <10 && 3 <c) {
//			System.out.println("A");
//		}
//		int d = 6;
//		if (d >= 5 || d <= 0) {
//			System.out.println("D");
//		}

		// java-07
//		int e = 7;
//		if (e <8) {
//			System.out.println("A");
//		}else if (e <10) {
//			System.out.println("B");
//		}
//		int g = 5;
//		if (g % 2 == 0) {
//			System.out.println("偶数");
//		}else {
//			System.out.println("奇数");
//		}

		// java-08
//		int a = 10;
//		if (a > 0) {
//			if (a == 2) {
//				System.out.println("A");
//			}else if (a == 3) {
//				System.out.println("B");
//			}else {
//				System.out.println("C");
//			}
//		}
//		int number = 50;
//		if (number < 20) {
//			System.out.println("未成年");
//		}else if (number == 77) {
//			System.out.println("喜寿");
//		}else if (number == 88) {
//			System.out.println("米寿");
//		}else {
//			System.out.println("成人");
//		}

		// java-09
//		int a = 5;
//		switch(a) {
//		case 0:
//			System.out.println("aは0に等しい");
//			break;
//		case 1:
//			System.out.println("aは1に等しい");
//			break;
//		default:
//			System.out.println("aは0でも1でもない");
//		}
//		String b = "青";
//		switch(b) {
//		case "赤":
//			System.out.println("赤組です。");
//			break;
//		case "白":
//			System.out.println("白組です。");
//			break;
//		default:
//			System.out.println("エラーです。");
//		}

		// java-10 配列

		// java-11 多次元配列
//		String[][]country =
//			{
//					{"Japan", "Thailand"},
//					{"America", "Brazil"},
//					{"France", "Russia"}
//			};
//		System.out.println(country[2][1]);
//
//		String[][]country1 = new String[3][2];
//
//		country1[0][0] = "日本";
//		country1[0][1] = "タイ";
//		country1[1][0] = "アメリカ";
//		country1[1][1] = "ブラジル";
//		country1[2][0] = "フランス";
//		country1[2][1] = "ロシア";
//
//		System.out.println(country1[1][1]);

		// java-12 for文
//		for (int i = 0; i <10; i++) {
//			System.out.println(i);
//		}
//		for (int i =0; i <10; i+=3) {
//			System.out.println(i);
//		}

		// java-13 for文 ネスト 条件演算子
//		for (int a = 0; a < 3; a++) {
//			for (int b = 1; b <4; b++) {
//				System.out.println(b);
//			}
//			System.out.println("\n");
//		}
//
//		int a = 2;
//		String b = a % 2 == 0 ? "偶数" : "奇数";
//		System.out.println(b);
//
//		for (int i = 0; i <=5; i++) {
//			String c = i % 2 == 0 ? "☆" : "★";
//			System.out.println(c);
//		}

		// java-14
//		int i = 0;
//		while(i < 5) {
//			System.out.println(i);
//			i++;
//		}
//		int a = 0;
//		while(a <= 10) {
//			System.out.println(a);
//			a+= 2;
//		}

		// jav-15
//		int i = 1;
//		do {
//			System.out.println(i);
//			i--;
//		} while(i > 1);
//
//		int a = 10;
//		do {
//			System.out.println(a);
//			a-= 3;
//		} while (a >1);


		// java 基礎演習
		int age = 100;
		System.out.println("年齢は" + age + "歳です。");

		String name = "磯貝";
		System.out.println("私の名前は" + name + "です。");

		int abc = 10;
		int def = 20;
		System.out.println(abc + "+" + def + "は" + (abc + def) );

		int a = 10;
		if(a <=15) {
			System.out.println("aは15以下です");
		}
		int b = 8;
		if(b >= 3) {
			System.out.println("aは3以上です。");
		}
		int c = 5;
		if(c <= 3) {
			System.out.println("aは3以下です。");
		}else if(c >=3) {
			System.out.println("aは3以上です。");
		}
		int d = 7;
		if (d >= 7) {
			System.out.println("dは7以上です。");
		}else if(d <= 7) {
			System.out.println("dは7以上です。");
		}
		int e = 90;
		if(e >= 99) {
			System.out.println("99以上です。");
		}else if(e <= 99) {
			System.out.println("99以下です。");
		}
		int f = 5;
		if( f % 2 == 0) {
			System.out.println("丁");
		}else {
			System.out.println("半");
		}
		int g = 39;
		if(g < 20) {
			System.out.println("未成年");
		}else if(g == 77) {
			System.out.println("喜寿");
		}else if(g == 88) {
			System.out.println("米寿");
		}else {
			System.out.println("成人");
		}

		String h = "B";
		switch(h) {
		case "A" :
			System.out.println("30位いないです。");
			break;
		case "B" :
			System.out.println("50位以内です。");
			break;
		case "C" :
			System.out.println("50位以下です。");
			break;
			}
		int j = 2;
		switch(j) {
		case 0:
			System.out.println("aは0です。");
			break;
		case 1:
			System.out.println("aは1です。");
			break;
		case 2:
			System.out.println("aは2です。");
			break;
		default:
			System.out.println("aは0・1・2のいずれでもありません。");
		}

		for(int y = 1; y <= 10; y++) {
			System.out.println(y);
		}
		for(int k = 3; k <= 10; k++) {
			System.out.println(k);
		}
		for(int l = 0; l < 10; l +=2) {
			System.out.println(l);
		}
		for (int m = 1; m <= 9; m++) {
			for (int n = 1; n <=9; n++) {
				System.out.print(m * n);
			}
			System.out.println("←" + m + "の段");
		}
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.print(i + "/");
			}
		}
		for(int i = 1; i <= 9; i++) {
			for(int z = 1; z <= 9; z++) {
				System.out.println(i + "x" + z + "=" + (i * z));
			}
		}

		int o = 1;
		while(o <= 10) {
			System.out.println(o);
			o++;
		}
		int p = 10;
		while(p >= 0) {
			System.out.print(p);
			p -=2;
		}
	}
}

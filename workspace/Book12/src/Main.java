/**
 *
 */
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;

import java.io.InputStream;
import java.net.URL;

/**
 * @author internousdev
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
//		Date now = new Date();
//		Calendar c = Calendar.getInstance();
//		c.setTime(now);
//		int day = c.get(Calendar.DAY_OF_MONTH);
//		day += 100;
//		c.set(Calendar.DAY_OF_MONTH, day);
//		Date future = c.getTime();
//		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
//		System.out.println(f.format(future));


		URL u = new URL("https://book.impress.co.jp/");
		InputStream is = u.openStream();
		int i = is.read();
		while (i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = is.read();
		}

	}

}

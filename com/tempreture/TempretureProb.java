package com.tempreture;

import java.util.Scanner;

public class TempretureProb {
	static int temperaturConversion(int tem, char t) {
		int convertor;
		if (t == 'c' || t == 'C') {
			convertor = (tem * 9 / 5) + 32;
		} else if (t == 'f' || t == 'F') {
			convertor = (tem - 32) * 5 / 9;
		} else {
			System.out.println("Enter correct input");
			return 0;
		}
		return convertor;
	}
	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter temp in c or f");
			int tem = s.nextInt();
			char t = s.next().charAt(0);
			s.close();
			if (t != 'f' && t != 'F' && t != 'c' && t != 'C') {
				System.out.println("enter correct input");
				main(args);
				return;
			}
			tem = temperaturConversion(tem, t);
			System.out.println("coverted temp is " + tem);
		} catch (Exception e) {
			System.out.println("temperature in format 4545 c");
		}

	}
}

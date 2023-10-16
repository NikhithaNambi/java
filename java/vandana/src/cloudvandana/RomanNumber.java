package cloudvandana;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumber {
	public static int romanNum(String s) {
		Map<Character, Integer> rV = new HashMap<Character,Integer>();
		rV.put('I', 1);
		rV.put('V', 5);
		rV.put('X', 10);
		rV.put('L', 50);
		rV.put('C', 100);
		rV.put('D', 500);
		rV.put('M', 1000);
		int r = 0;
		int p = 0;
		for (int i=s.length()-1; i>=0; i--) {
			char Char = s.charAt(i);
			int cV = rV.get(Char);
			if (cV < p) {
				r -= cV;
			} 
			else {
				r += cV;
			}
			p = cV;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Roman Number To Get Integer");
		String str = s.next();
		System.out.println(romanNum(str));
		s.close();
	}

}

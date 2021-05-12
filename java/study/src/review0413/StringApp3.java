package review0413;

public class StringApp3 {

	public static void main(String[] args) {
		// 정수, 실수, 문자, 불린값을 문자열로 바꾸기
		int intValue = 1;
		double doubleValue = 3.13;
		char charValue = 'a';
		boolean booleanValue = false;
		
		// String String.valueOf(boolean value)
		String a = String.valueOf(booleanValue);
		System.out.println(a);
		// String String.valueOf(int value)
		String b = String.valueOf(intValue);
		System.out.println(b);
		// String String.valueOf(long value)
		String c = String.valueOf(10000000000000L);
		System.out.println(c);
		// String String.valueOf(double value)
		String d = String.valueOf(doubleValue);
		System.out.println(d);
		// String String.valueOf(char value)
		String e = String.valueOf(charValue);
		System.out.println(e);
	}
}

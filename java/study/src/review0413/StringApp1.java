package review0413;

public class StringApp1 {

	public static void main(String[] args) {
		String a = "안녕";
		String b = "안녕";
		String c = new String("안녕");
		String d = new String("안녕");
		//a == b
		boolean value1 = (a==b);
		System.out.println(value1);
		//a.equals(b)
		boolean value2 = a.equals(b);
		System.out.println(value2);
		//c == d
		boolean value3 = (c==d);
		System.out.println(value3);
		//c.equals(d)
		boolean value4 = c.equals(d);
		System.out.println(value4);
	}
}

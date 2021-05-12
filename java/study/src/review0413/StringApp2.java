package review0413;

public class StringApp2 {

	public static void main(String[] args) {
		String str1 = "qawerdfsdfsa";
		//int length()
		//문자열의 길이를 반환한다.
		int value1 = str1.length();
		System.out.println(value1);

		//boolean isEmpty()
		//빈문자열인지 여부를 반환한다.
		boolean value2 = str1.isEmpty();
		System.out.println(value2);

		//boolean contains(CharSequence s)
		//지정된 문자열을 포함하고 있는지 여부를 반환한다.
		boolean value3 = str1.contains("we");
		System.out.println(value3);
		
		//int indexOf(String str)
		//지정된 문자열이 처음으로 등장하는 위치를 반환한다.
		int value4 = str1.indexOf("w");
		System.out.println(value4);
		
		//int lastIndexOf(String str)
		//지정된 문자열이 맨 마지막으로 등장하는 위치를 반환한다.
		int value5 = str1.lastIndexOf("f");
		System.out.println(value5);

		//String substring(int beginIndex)
		//지정된 위치에서 문자열의 끝에 해당하는 글자로 구성된 문자열을 반환한다.
		String value6 = str1.substring(5);
		System.out.println(value6);

		//String substring(int beginIndex, int endIndex)
		//지정된 시작위치에서 지정된 끝위치 앞까지 해당하는 글자로 구성된 문자열을 반환한다.
		String value7 = str1.substring(2, 5);
		System.out.println(value7);

		//String replace(CharSequence target, CharSequence replacement)
		//문자열에서 target에 해당되는 문자열을 찾아서 replacement에 지정된 문자열로 변경한 새로운 문자열을 반환한다.
		String value8 = str1.replace("a", "**");
		System.out.println(value8);

		//String toLowerCase(), String toUpperCase()
		//문자열을 소문자, 대문자로 바뀐 새로운 문자열을 반환한다.
		String value9 = str1.toUpperCase();
		System.out.println(value9);
		String value10 = value9.toLowerCase();
		System.out.println(value10);

		//boolean starsWith(String prefix), boolean endWith(String suffix)
		//해당문자열이 prefix에서 지정한 내용으로 시작하는지,해당문자열이 suffix에서 지정한 내용으로 끝나는지 여부를 반환한다.
		boolean value11 = str1.startsWith("df");
		System.out.println(value11);
		boolean value12 = str1.endsWith("a");
		System.out.println(value12);

		//String[] split(String exp)
		//문자열을 exp에서 지정한 표현식 혹은 구분자로 잘라서 각각의 요소를 배열에 담아서 반환한다.
		String[] value13 = str1.split("");
		for(String v : value13) {
			System.out.print(v);
		}
		
		System.out.println();
		//String trim()
		//문자열에서 불필요한 좌우 공백이 제거된 새로운 문자열을 반환한다.
		String str2 = "       sdf asdfasdf dfdfs";
		String value14 = str2.trim();
		System.out.println(str2);
		System.out.println(value14);
	}
}

package review0405.phone;

public class PhoneApp {

	public static void main(String[] args) {

		//Phone 객체 생성
		Phone p = new Phone();
		//전화번호 설정
		p.setTel("010-2222-3333");
		//전화걸기
		p.call();

		//FeaturePhone 객체 생성
		FeaturePhone fp = new FeaturePhone();
		//전화번호 설정
		fp.setTel("010-3333-3423");
		//화소 설정
		fp.setPixel(300000);
		//전화걸기
		fp.call();
		//사진찍기
		fp.takePicture();

		//SmartPhone 객체 생성
		SmartPhone sp = new SmartPhone();
		//전화번호 설정
		sp.setTel("010-3313-1322");
		//전화걸기
		sp.call();
		//아이피설정
		sp.setIp("199.222.222.10");
		//이메일주소설정
		sp.setEmailAddress("hello@gmail.com");
		//인터넷 접속
		sp.web();
		//메일보내기
		sp.mail();
	}

}

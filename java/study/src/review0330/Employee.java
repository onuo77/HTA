package review0330;

public class Employee {
	
	//Employee.java는 사원번호, 사원이름, 소속부서명, 직위, 급여, 커미션지급여부를 정보를 저장하는 객체를 위한 클래스다.
    //위의 정보를 담는 멤버변수를 정의한다.
	int employeeNo;
	String employeeName;
	String deptName;
	String position;
	int pay;
	boolean bonus;
	
    //위의 정보를 화면에 출력하는 void printEmployeeInfo() 메소드를 정의한다.
	
	void printEmployeeInfo() {
		System.out.println("### 사원정보출력 ###");
		System.out.println("사원번호 : " + employeeNo);
		System.out.println("사원이름 : " + employeeName);
		System.out.println("소속부서명 : " + deptName);
		System.out.println("직위 : " + position);
		System.out.println("급여 : " + pay);
		System.out.println("커미션지급여부 : " + bonus);
	}
}

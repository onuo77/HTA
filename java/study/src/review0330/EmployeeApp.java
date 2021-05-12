package review0330;

public class EmployeeApp {
	
	public static void main(String[] args) {
       //Employee객체를 생성한다.
		Employee employee = new Employee();
		
       //생성된 Employee객체의 멤버변수에 사원정보를 저장한다.
		employee.employeeNo = 100;
		employee.employeeName = "홍길동";
		employee.deptName = "교육지원과";
		employee.position = "주무관";
		employee.pay = 2000000;
		employee.bonus = true;
       
		//생성된 Employee객체의 printEmployeeInfo() 메소드를 호출해서 회원정보를 화면에 출력한다.
		employee.printEmployeeInfo();
	}
}

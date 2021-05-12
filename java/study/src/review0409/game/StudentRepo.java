package review0409.game;

public class StudentRepo {
	//은닉화 Student배열 생성(5)
	private Student[] students = new Student[5];

	//기본 생성자 안에 배열 초기화
	public StudentRepo() {
		students[0] = new Student("짱구",50,80,60);
		students[1] = new Student("철수",100,100,100);
		students[2] = new Student("유리",80,70,90);
		students[3] = new Student("맹구",90,80,80);
		students[4] = new Student("훈이",10,20,30);
	}

	Stats getStats() {
		return new StudentStats();
	}

	//은닉화 내부클래스 StudentStats impl Stats 생성
	//학생들의 성적을 기반으로 총합과 평균을 제공하는 Stats 인터페이스 구현 클래스
	private class StudentStats implements Stats{

		@Override
		public int total() {
			int totalScore = 0;
			for (Student student : students) {
				totalScore += student.getKor();
				totalScore += student.getEng();
				totalScore += student.getMath();
			}
			return totalScore;
		}

		@Override
		public int average() {
			int totalScore = this.total();
			int average = totalScore/(3*students.length);
			return average;
		}

	}

}

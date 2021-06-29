package com.sample.school.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sample.school.dto.CourseRegisteredStudentDto;
import com.sample.school.utils.MybatisUtils;
import com.sample.school.vo.Registration;

public class RegistrationDao {

	private static RegistrationDao instance = new RegistrationDao();
	private RegistrationDao() {
		this.sqlSessionFactory = MybatisUtils.getSqlSessionFactory();
	}
	public static RegistrationDao getInstance() {
		return instance;
	}
	
	private SqlSessionFactory sqlSessionFactory;
	
	/**
	 * 수강신청 등록정보를 전달받아서 SAMPLE_SCHOOL_REGISTRATIONS에 저장한다.
	 * @param registration 수강신청등록정보
	 */
	public void insertRegistration(Registration registration) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.insert("insertRegistration", registration);
		session.close();
	}
	
	/**
	 * 변경된 수강신청등록정보를 전달받아서 SAMPLE_SCHOOL_REGISTRATIONS에 반영한다.
	 * @param registration 변경된 내용이 포함된 수강신청등록정보
	 */
	public void updateRegistration(CourseRegisteredStudentDto registration) {
		SqlSession session = sqlSessionFactory.openSession(true);
		session.update("updateRegistration", registration);
		session.close();		
	}
	
	/**
	 * 과정번호를 전달받아서 해당 과정을 수강신청/취소한 학생들의 정보를 조회해서 반환한다.
	 * @param courseNo 과정번호
	 * @return 수강신청/취소한 학생정보
	 */
	public CourseRegisteredStudentDto getRegisteredStudentByCourseNo(int courseNo) {
		SqlSession session = sqlSessionFactory.openSession();
		CourseRegisteredStudentDto registrations = session.selectOne("getRegisteredStudentByCourseNo", courseNo);
		session.close();
		return registrations;
	}
	
	/**
	 * 과정번호를 전달받아서 해당 과정을 수강신청/취소한 학생들의 정보를 조회해서 반환한다.
	 * @param courseNo 과정번호
	 * @return 수강신청/취소한 학생정보
	 */
	public List<CourseRegisteredStudentDto> getRegisteredStudentsByCourseNo(int courseNo) {
		SqlSession session = sqlSessionFactory.openSession();
		List<CourseRegisteredStudentDto> registrations = session.selectList("getRegisteredStudentsByCourseNo", courseNo);
		session.close();
		return registrations;
	}	
	
	/**
	 * 학생아이디를 전달받아서 해당 과정을 수강신청/취소한 학생들의 정보를 조회해서 반환한다.
	 * @param id 학생아이디
	 * @return 수강신청/취소한 학생정보
	 */
	public List<CourseRegisteredStudentDto> getRegisteredStudentsByStudentId(String id) {
		SqlSession session = sqlSessionFactory.openSession();
		List<CourseRegisteredStudentDto> courseRegisteredStudentDto= session.selectList("getRegisteredStudentsByStudentId", id);
		session.close();
		return courseRegisteredStudentDto;
	}
}

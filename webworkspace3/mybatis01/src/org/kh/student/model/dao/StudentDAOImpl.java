package org.kh.student.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kh.student.model.vo.Student;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public Student selectStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertStudent(SqlSession session) {
		int result = session.insert("student.test1");
		return result;
	}

	public int insertStudent(SqlSession session, String name) {
		int result = session.insert("student.test2",name);
		return result;
	}

	public int insertStudent(SqlSession session, Student st) {
		int result = session.insert("student.test3", st);
		return result;
	}

	public int updateStudent(SqlSession session, Student st) {
		int result = session.update("student.test4", st);
		return result;
	}

	public int deleteStudent(SqlSession session, int studentNo) {
		int result = session.update("student.test5", studentNo);
		return result;
	}

	public Student selectOneStudent(SqlSession session, int studentNo) {
		Student st = session.selectOne("student.test6",studentNo);
		return st;
	}

	public ArrayList<Student> selectAllStudent(SqlSession session) {
		List list = session.selectList("student.test7");
		return (ArrayList<Student>)list;
	}

}
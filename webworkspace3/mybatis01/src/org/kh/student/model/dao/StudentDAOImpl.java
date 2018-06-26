package org.kh.student.model.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
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

}
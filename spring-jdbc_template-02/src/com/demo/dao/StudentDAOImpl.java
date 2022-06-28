package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.api.Student;
import com.demo.resultsetextractor.StudentResultSetExtractor;
import com.demo.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insert(Student student) {
		String sql = "insert into demo.student1 values(?,?,?)";
		Object arr[] = {student.getRoll_no(), student.getName(), student.getAddress()};
		int noOfUpdatedRows = jdbcTemplate.update(sql, arr);
		System.out.println("Number of rows updated : "+noOfUpdatedRows);
	}

	@Override
	public void insert(List<Student> student) {
	
		String sql = "insert into demo.student1(roll_no,name,address)values(?,?,?)";
		List<Object[]> sqlArgs = new ArrayList();
		for(Student temp : student)
		{
			Object arr[] = {temp.getRoll_no(), temp.getName(), temp.getAddress()};
			sqlArgs.add(arr);
		}
		int[] noOfUpdatedRows = jdbcTemplate.batchUpdate(sql,sqlArgs);
		System.out.println("Number of rows updated : "+noOfUpdatedRows);
	}

	@Override
	public void cleanUp() {

		String sql = "truncate table demo.student1";
		jdbcTemplate.update(sql);
		System.out.println("Table cleaned");
	}

	@Override
	public List<Student> findAllStudents() {

		String sql = "SELECT * FROM demo.student1";
		List<Student> students = jdbcTemplate.query(sql, new StudentRowMapper());
		return students;
	}

	@Override
	public Student findStudentById(int id) {

		String sql = "SELECT * FROM demo.student1 where roll_no=?";
		//Student student = jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Student>(Student.class), id);
		return student;
	}

	@Override
	public boolean deleteStudentById(int id) {
		String sql = "delete from demo.student1 where roll_no=?";
		Object args[] = {id};
		int noOfRowsDeleted = jdbcTemplate.update(sql, id);
		System.out.println("Number of records deleted is : "+noOfRowsDeleted);
		if(noOfRowsDeleted==1)
		{
			return true;
		}
		return false;
	}

	@Override
	public int updateStudentById(Student student) {

		String sql = "update demo.student1 	set address=? where roll_no=?";
		Object args[] = {student.getAddress(), student.getRoll_no()};
		return jdbcTemplate.update(sql,args);
	}

	@Override
	public List<Student> findStudentByName(String name) {
		String sql = "select * from demo.student1 where name=?";
		List<Student> students = jdbcTemplate.query(sql, new StudentResultSetExtractor(), name);
		return students;
	}

}

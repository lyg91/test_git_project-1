package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import work.model.dto.Student;

public class StudentDao {
	
	// Factory Pattern ���� ���� : dao ���� ����� ���� FactoryDao ��ü ����
	private FactoryDao factory = FactoryDao.getInstance();

	private static StudentDao instance = new StudentDao();

	/** �⺻������ : jdbc driver �ε� ���� => FactoryDao ���� */
	private StudentDao() {
	}

	public static StudentDao getInstance() {
		return instance;
	}
	
	
	/**
	 * ��ϱ��
	 * 
	 * @param user
	 * @return int
	 */
	public int insert(Student dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String id = dto.getId();
		String pw = dto.getPw();
		String name = dto.getName();
		String mobile = dto.getMobile();
		String email = dto.getEmail();
		String birth = dto.getBirth();
		String gender = dto.getGender();
		String major = dto.getMajor();
		String division = dto.getDivision();
		String grade = dto.getGrade();
		String img = dto.getImg();
		String gDate = dto.getgDate();
		String company = dto.getCompany();
		String job = dto.getJob();
		String career = dto.getCareer();
		String part = dto.getPart();

		try {
			conn = factory.getConnection();
			String sql = "insert into STUDENTS values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, mobile);
			pstmt.setString(5, email);
			pstmt.setString(6, birth);
			pstmt.setString(7, gender);
			pstmt.setString(8, major);
			pstmt.setString(9, division);
			pstmt.setString(10, grade);
			pstmt.setString(11, img);
			pstmt.setString(12, gDate);
			pstmt.setString(13, company);
			pstmt.setString(14, job);
			pstmt.setString(15, career);
			pstmt.setString(16, part);
			int rows = pstmt.executeUpdate();

			return rows;
		} catch (SQLException e) {
			System.out.println("error: ��� ����");
			e.printStackTrace();

		} finally {
			factory.close(conn, pstmt);

		}

		return 0;
	}
	
	
	
	/** ���̵� �������� �˻� �޼���*/
	public boolean isUser(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = factory.getConnection();
			String sql = "select name from STUDENTS where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			return rs.next();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close(conn, pstmt, rs);
		}
		return false;
	}
	

}

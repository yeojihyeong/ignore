package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	// Oracle 연결 정보
	private String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
	private String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String connectedID = "hr";
	private String conntectedPwd = "hr";

	// 각 메소드에서 공통적으로 사용하는 필드
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// DB 연결하기
	public void connect() {
		try {
			// 1. JDBC Driver 로딩하기
			Class.forName("jdbc_driver");

			// 2. DB 서버 접속하기
			String url = "jdbc_url";
			String id = "connectedID";
			String password = "conntectedPwd";

			Connection conn = DriverManager.getConnection(url, id, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// 자원 해제하기
	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 전체조회 select
	public List<Emp> selectAll() {
		// 값을 담을 변수 선언
		List<Emp> list = new ArrayList<>();
		try {
			connect();// DB연결 연결하기
			Statement stmt = conn.createStatement(); // SQL실행및 결과 받음.
			String select = "select * from employees order by employee_id";
			ResultSet rs = stmt.executeQuery(select);

			while (rs.next()) {
				Emp emp = new Emp();
				emp.setCommissionPct(rs.getInt("commission_pct"));
				emp.setDepartmentId(rs.getInt("department_id"));
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setListName(rs.getString("last_name"));
				emp.setManagementId(rs.getInt("manager_id"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));

				list.add(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 반드시 실행시키기 위해 finally 구문 사용
			disconnect();// 자원 및 DB 연결 해제 하기
		}
		return list;
	}

	// 단건조회 or 상세조회 select

	public Emp selectOne(int employeeId) {
		Emp emp = new Emp();
		try {
			connect();// DB연결 연결하기
			stmt = conn.createStatement(); // 실행결과 가져오기
			String select = "select * from employees where employee_id = " + employeeId;
			rs = stmt.executeQuery(select);

			if (rs.next()) {
				emp.setCommissionPct(rs.getInt("commission_pct"));
				emp.setDepartmentId(rs.getInt("department_id"));
				emp.setEmail(rs.getString("email"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setListName(rs.getString("last_name"));
				emp.setManagementId(rs.getInt("manager_id"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setSalary(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 반드시 finally 로 자원 해제 및 DB연결 해제
			disconnect();// 자원 해제 하기
		}
		return emp;
	}

	// 삽입 insert
	public void insert(Emp emp) {
		try {
			//DB연결
		 connect();
		 String insert = "insert into employees values (?,?,?,?,?,?,?,?,?,?,?)";
         pstmt = conn.prepareStatement(insert);
         pstmt.setInt(1, emp.getEmployeeId());
         pstmt.setString(2, emp.getFirstName());
         pstmt.setString(3, emp.getListName());
         pstmt.setString(4, emp.getEmail());
         pstmt.setString(5, emp.getPhoneNumber());
         pstmt.setDate(6, emp.getHireDate());
         pstmt.setString(7, emp.getJobId());
         pstmt.setInt(8, emp.getSalary());
         pstmt.setDouble(9, emp.getCommissionPct());
         pstmt.setInt(10, emp.getManagementId());
         pstmt.setInt(11, emp.getDepartmentId());
         // 4. SQL 실행
         int result = pstmt.executeUpdate();
         // 5. 결과값을 받아와서 출력하기
         System.out.println(result + "건이 완료되었습니다.");
	}catch(SQLException e) {
		e.printStackTrace();
	}finally {
		disconnect();
	}
	}


	// 수정 update
	public void update(Emp emp) {
		int result;
	try
	{
		connect();
		String update = "update employees set last_name = ? where employee_id = ?";
		pstmt = conn.prepareStatement(update);
		pstmt.setString(1, "Kang");
		pstmt.setInt(2, 1000);

		result = pstmt.executeUpdate();

	System.out.println("update 결과 :" + result);
	}catch(SQLException e) {
		e.printStackTrace();
	} finally {

	disconnect();
	}
}
	// 삭제 delete
}

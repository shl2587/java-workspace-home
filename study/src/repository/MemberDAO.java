package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.MemberDTO;
import oracle.jdbc.driver.OracleDriver;

public class MemberDAO {
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	private String url = "jdbc:oracle:thin:@192.168.1.100:1521:xe";
	private String user = "c##itbank";
	private String password = "it";
	
	
	private String className = OracleDriver.class.getName();
	
	public MemberDAO() {
		
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public int insert(MemberDTO dto) {
		int row = 0;
		
		String sql = "insert into member (userid, userpw, nickname)"
						+ "values (?, ?, ?)";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getUserpw());
			pstmt.setString(3, dto.getNickname());
			
			rs = pstmt.executeQuery();
			
			row = 1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(rs != null)		rs.close();		} catch (SQLException e) {}
			try { if(pstmt != null)		pstmt.close();	} catch (SQLException e) {}
			try { if(conn != null)		conn.close();	} catch (SQLException e) {}
		}
		
		return row;
	}
	
	public MemberDTO login(String userid, String userpw) {
		
		String sql = "select * from member where userid = ? and userpw = ?";
		MemberDTO dto = new MemberDTO();;

		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			pstmt.setString(2, userpw);
			
			rs = pstmt.executeQuery();
			
			
			if (rs.next()) {
				dto.setUserid(rs.getString("userid"));
				dto.setUserpw(rs.getString("userpw"));
				dto.setNickname(rs.getString("nickname"));
				
			}
			
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(rs != null)		rs.close();		} catch (SQLException e) {}
			try { if(pstmt != null)		pstmt.close();	} catch (SQLException e) {}
			try { if(conn != null)		conn.close();	} catch (SQLException e) {}
		}
		
		return dto;
	}
	
	public ArrayList<MemberDTO> coincide(String userpw) {
		
		String sql = "select * from member where userpw = ?";
		MemberDTO dto = new MemberDTO();;
		ArrayList<MemberDTO> coincide = new ArrayList<>();

		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userpw);
			
			rs = pstmt.executeQuery();
			
			
			if (rs.next()) {
				dto.setUserid(rs.getString("userid"));
				dto.setUserpw(rs.getString("userpw"));
				dto.setNickname(rs.getString("nickname"));
				
				coincide.add(dto);
				
				
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(rs != null)		rs.close();		} catch (SQLException e) {}
			try { if(pstmt != null)		pstmt.close();	} catch (SQLException e) {}
			try { if(conn != null)		conn.close();	} catch (SQLException e) {}
		}
		
		return coincide;

	}

	public int change(String userInfor, String userid, int check) {
		int row = 0;
		
		String sql = "update member set userpw = ? where userid = ?";
		
		if (check == 2) {
			sql = "update member set nickname = ? where userid = ?";
		}
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userInfor);
			pstmt.setString(2, userid);
			
			row = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(rs != null)		rs.close();		} catch (SQLException e) {}
			try { if(pstmt != null)		pstmt.close();	} catch (SQLException e) {}
			try { if(conn != null)		conn.close();	} catch (SQLException e) {}
		}
		
		return row;
	}

	public int delete(MemberDTO dto) {
		int row = 0;
			
		String sql = "delete from member where userid = ?";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			row = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(rs != null)		rs.close();		} catch (SQLException e) {}
			try { if(pstmt != null)		pstmt.close();	} catch (SQLException e) {}
			try { if(conn != null)		conn.close();	} catch (SQLException e) {}
		}
		
		return row;
	}
	
	
	
	
}

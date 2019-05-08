package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.entity.User;
import com.mysql.jdbc.PreparedStatement;

public  class LoginDao1 {	
	public static int Login(User user){
		Connection con=null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		int result=-1;
		int flag=-1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mts?useSSL=false","root","11111111");
			String sql="select count(*) from mts_user where nickname=? and passward=?";
			  pstmt=(PreparedStatement) con.prepareStatement(sql);
		pstmt.setString(1, user.getNickname());
		pstmt.setString(2, user.getPassward());
		 rs=pstmt.executeQuery();
		 while(rs.next()){
			result=rs.getInt(1);
			
		 }if(result>0){
			 return 1;
			 
		 }else{
			 return 0;//登陆失败（用户名或密码错误）
		 }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return -1;//登陆失败(系统异常)
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}finally{
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				}
				}
			}
		}
	}
}
			
		
		
	

	


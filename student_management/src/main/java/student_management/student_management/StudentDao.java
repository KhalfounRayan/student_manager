package student_management.student_management;

import java.sql.*;


public class StudentDao {
	public static boolean insertStudentRecordToDB(Student st) {
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "insert into students(sname,slastname,sclasse) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentlastname());
			pstmt.setString(3, st.getStudentclasse());
		
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}


	public static boolean deleteStudentRecordFromDB(int userID) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "delete from students where sid=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			//set the value of parameters
			pstmt.setInt(1, userID);
			
			//execute..
			pstmt.executeUpdate();
			
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	public static void showStudent(int userID) {
		
		// TODO Auto-generated method stub
				boolean f = false;
				try {
					Connection con = CP.createc();
					String query = "select * from students where sid="+userID;
					Statement st = con.createStatement();
					ResultSet set = st.executeQuery(query);
					
					while(set.next()) {
						int id = set.getInt(1);
						String name = set.getString(2);
						String lastname = set.getString(3);
						String classe = set.getString("sclasse");
						
						System.out.println("Student ID: " + id + " \n Student Name: " + name + " \nStudent lastname: " + lastname + " \nStudent classe: " + classe);
						System.out.println("----------------------------------------------");
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
	}

	
	
	public static void showAllStudentRecords() {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			Connection con = CP.createc();
			String query = "select * from students";
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(query);
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String lastname = set.getString(3);
				String classe = set.getString("sclasse");
				
				System.out.println("Student ID: " + id + " \n Student Name: " + name + " \nStudent lastname: " + lastname + " \nStudent classe: " + classe);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}


	public static boolean updateStudentRecord(int val,String toUpdate,int id,Student st) {
		// TODO Auto-generated method stub
		boolean f = false;
		
		try {
			  Connection con = CP.createc();
			 if(val == 1) {
					//Update Name
					
						String query = "update students set sname=? where sid=?";
						PreparedStatement pstmt = con.prepareStatement(query);
						pstmt.setString(1, toUpdate);
						pstmt.setInt(2, id);
						
						//execute..
						pstmt.executeUpdate();
						f = true;
				}
				else if(val == 2) {
					//Update lastname
					String query = "update students set slastname=? where sid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else if(val == 3) {
					//Update classe
					String query = "update students set sclasse=? where sid=?";
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, toUpdate);
					pstmt.setInt(2, id);
					
					//execute..
					pstmt.executeUpdate();
					f = true;
				}
				else {
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}
}

;
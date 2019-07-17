package polling;
import java.sql.*;

public class Connection {
	
	
		
		java.sql.Connection con;
		

		
		public void connectVoter(Voter voter) {
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			
			Statement stmt=null;		
			
		//**voter details will be insert
			

			String query = ("insert into voter (voterid,username,password)" + " values ('" + voter.getVoterId() + "','"
					+ voter.getUsername() + "','" + voter.getPassword() + "')");
			stmt= con.createStatement();
			   
			stmt.execute(query);
			System.out.println("voter value  inserted");
	
				
		}
				    catch (Exception e)
				    {
				    	System.err.println("Got an insert table exception" + e);
						System.err.println(e.getMessage());
				    }
		}

		public void connectCan(candidate can) {
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			
			Statement stmt=null;		
			String query = ("insert into candidate (id,password)" + " values ('" + can.getId() + "','"
					+ can.getPassword() + "')");
			
			stmt= con.createStatement();
			   
			stmt.execute(query);
			System.out.println("candidate value inserted");
	
		}

	    catch (Exception e)
	    {
	    	System.err.println("Got an insert table exception" + e);
			System.err.println(e.getMessage());
	    }
		}
			
	///////********------- voter value to be check -------******	\\\\\\\\\\	
			
		public void checkVoter(String x,String y)	{
			try {
				System.out.println("voter value check");
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			
				Statement stmt=null;
				stmt= con.createStatement();
				   
				String query=("select * from voter where password='"+ y +"");
						 ResultSet results = stmt.executeQuery(query);
						 while (results.next())
						 {
					            String password =  results.getString(1);
					            
					         if(password!=null) {
					        	 System.err.println("insert password" + "result.getPassword()");
					        	
					 
					        		 System.out.println("");
					         }}}
			catch (Exception e)
		    {
					 	    	System.err.println("password not match" + e);
					 			System.err.println(e.getMessage());
					 	    }
			
					     
					         {
						 }
						 
		}
}


import java.sql.*;

class ConMySql
{
public static void main(String kl[]) throws Exception
{ 
     Connection con;
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","mysql");
		//String s=null;
	
		if(con == null)
		{
			System.out.println("no");
			
		}
		else
		{
			System.out.println("yes");
			
		}
	}
		
		catch(Exception e)
	{
		e.printStackTrace();
	}
	
		
		
}
}

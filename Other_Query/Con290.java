import java.sql.*;


public class Con290 
{
    public static void main(String[] kl) throws Exception
    {
      Connection con=null;
	 
	   Class.forName("oracle.jdbc.OracleDriver");
 

con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Himanshu1996");
     
        String s =null;
		 if(con != null)
        {
            System.out.println("connection is successfull");
            
        }
		 else
        {
            System.out.println("not");
        }
        
		
    }    
}

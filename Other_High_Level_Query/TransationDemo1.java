import java.sql.*;
import java.util.*;

public class TransationDemo1
{
    public static void main(String[] kl) throws Exception
    {
      Connection con=null;
	 	   Class.forName("oracle.jdbc.OracleDriver");
 
 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Himanshu1996");
     
	 Statement st=con.createStatement();
	 System.out.println("data before transactuon");
	 
	 System.out.println("..................");
	 
	 ResultSet rs=st.executeQuery("select * from accounts");
	 while(rs.next())
	 {
	 System.out.println(rs.getString("name")+"\t"+rs.getInt("balance"));
	 }
	 
	 System.out.println("transaction begin");
	 con.setAutoCommit(false);
	 st.executeUpdate("update accounts set balance=balance+10000 where name='himanshu'");
	 System.out.println("con you please confirm tthis transaction of 10000 [yes]/[no]");
	 
	 Scanner sc=new Scanner(System.in);
	 String option=sc.next();
	 if(option.equalsIgnoreCase("yes"))
	 {
	 con.commit();
	 System.out.println("transaction commit");
	 }
	 else
	 {
	 con.rollback();
	 System.out.println("t is rollback");
	 }
	 
	 System.out.println("Data After Tracsaction");
	 System.out.println("..................");
	 
	 ResultSet rs1=st.executeQuery("select * from accounts");
	 while(rs1.next())
	 {
	 System.out.println(rs1.getString(1)+"\t"+rs1.getInt(2));
	 }
	 
	 con.close();
	 
	 }
	 }
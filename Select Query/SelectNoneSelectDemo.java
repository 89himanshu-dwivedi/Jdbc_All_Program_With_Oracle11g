import java.sql.*;
import java.util.*;


class SelectNoneSelectDemo
{
public static void main(String h[]) throws Exception
{
String driver="oracle.jdbc.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:orcl";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"system","System1996");

 Statement st=con.createStatement();
 
 Scanner sc=new Scanner(System.in);
 System.out.println("enter sqlquery");
 String sql=sc.nextLine();
 
 boolean b=st.execute(sql);
 if(true)
 {
 
 ResultSet rs=st.getResultSet();
 System.out.println("ID\tENAME\tESAL\tEADDR");
 
 while(rs.next())
 {
	
//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
System.out.println(rs.getInt("id")+"\t"+rs.getString("ename")+"\t"+rs.getDouble("esal")+"\t"+rs.getString("eaddr"));
 }
 }
else
{
int rowcount=st.getUpdateCount();
System.out.println("the no of record effected"+rowcount);	
 
}
con.close();
}
}
import java.sql.*;
import java.util.*;


class SelectRangeOfRecordDemo1
{
public static void main(String h[]) throws Exception
{
String driver="oracle.jdbc.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:orcl";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"system","System1996");

 Statement st=con.createStatement();
 
 Scanner sc=new Scanner(System.in);
 System.out.println("enter employees address name");
 String addr=sc.next();
  String sqlquery=String.format("select * from employees where eaddr='%s'",addr);
 
 Boolean flag=false;
 ResultSet rs=st.executeQuery(sqlquery);
 System.out.println("ID\tENAME\tESAL\tEADDR");
 
 while(rs.next())
 {
	 flag=true;
//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
System.out.println(rs.getInt("id")+"\t"+rs.getString("ename")+"\t"+rs.getDouble("esal")+"\t"+rs.getString("eaddr"));
 }
 if(flag==false)
	 System.out.println("not found record");
 
 con.close();
}
}
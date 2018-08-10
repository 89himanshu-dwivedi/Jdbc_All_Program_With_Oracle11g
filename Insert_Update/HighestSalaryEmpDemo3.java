import java.sql.*;
import java.util.*;


class HighestSalaryEmpDemo3
{
public static void main(String h[]) throws Exception
{
String driver="oracle.jdbc.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:orcl";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"system","System1996");

 Statement st=con.createStatement();
 
String sqlquery=("select * from employees where esal in (select max(esal) from employees)");
 
 
 ResultSet rs=st.executeQuery(sqlquery);
 
 
 while(rs.next())
 {
   System.out.println("Highest salary of employees");
System.out.println("--------------------------");   
//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
//System.out.println(rs.getInt("id")+"\t"+rs.getString("ename")+"\t"+rs.getDouble("esal")+"\t"+rs.getString("eaddr"));
 
 System.out.println(rs.getDouble(3));
 }

 con.close();
}
}
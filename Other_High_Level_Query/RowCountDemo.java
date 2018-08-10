import java.sql.*;
import java.util.*;


class RowCountDemo
{
public static void main(String h[]) throws Exception
{
String driver="oracle.jdbc.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:orcl";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"system","System1996");

 Statement st=con.createStatement();
 
 String sql="select count(*) from employees";
 ResultSet rs=st.executeQuery(sql);
 
 while(rs.next())
 {
 System.out.println("total no of row in employess table===\t==>>"+rs.getInt(1));
 }

 con.close();
 }
 }
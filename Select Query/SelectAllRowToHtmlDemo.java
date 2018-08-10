import java.sql.*;
import java.util.*;
import java.io.*;


class SelectAllRowToHtmlDemo
{
public static void main(String h[]) throws Exception
{
String driver="oracle.jdbc.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:orcl";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"system","System1996");

 Statement st=con.createStatement();
 
 /*
 Scanner sc=new Scanner(System.in);
 System.out.println("enter employees number");
 int n=sc.nextInt();
 */
 
String query="select * from employees";
 

 ResultSet rs=st.executeQuery(query);
 //System.out.println("ID\tENAME\tESAL\tEADDR");
 
 String data="";
 data=data+"<html><body><center><table border='1' bgcolor='green'>";
 data=data+"<tr><td>ID</td><td>ENAME</td><td>ESAL</td><td>EADDR</td></tr>";
 
 while(rs.next())
 {
data=data+"<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getDouble(3)+"</td><td>"+rs.getString(4)+"</td></tr>";
//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
//System.out.println(rs.getInt("id")+"\t"+rs.getString("ename")+"\t"+rs.getDouble("esal")+"\t"+rs.getString("eaddr"));
 }
 data=data+"</table></center></body></html>";
 FileOutputStream fos=new FileOutputStream("emp.html");
 byte[] b=data.getBytes();
 fos.write(b);
 fos.flush();
 System.out.println("open emp.html; go to get employees data");
 fos.close();
 con.close();
}
}
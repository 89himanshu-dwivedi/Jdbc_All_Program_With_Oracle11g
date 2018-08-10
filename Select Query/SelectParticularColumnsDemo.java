import java.sql.*;
class SelectParticularColumnsDemo
{
public static void main(String h[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String query="select id,esal from employees ";
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection(url,"system","System1996");
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery(query);
 
 boolean flag=false;
 
 System.out.println("ID\tESAL");
 System.out.println("--------------------------------");
 
 while(rs.next())
{
flag=true;
//System.out.println(rs.getInt(1)+"\t"+rs.getDouble(2));
System.out.println(rs.getInt("id")+"\t"+rs.getDouble("esal"));
 
 }
 if(false)
 System.out.println("not found data");
 
 con.close();
 }
 }
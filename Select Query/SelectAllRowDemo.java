import java.sql.*;

class SelectAllRowDemo
{
public static void main(String h[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection(url,"system","System1996");
 Statement st=con.createStatement();


//String query="select id,ename,esal ,eaddr from employees ";
String query="select * from employees ";
 ResultSet rs=st.executeQuery(query);
 
 boolean flag=false;
 
 
 System.out.println("ID\tENAME\tESAL\tEADDR");
 System.out.println("--------------------------------");
 
 while(rs.next())
{
flag=true;
//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
System.out.println(rs.getInt("id")+"\t"+rs.getString("ename")+"\t"+rs.getDouble("esal")+"\t"+rs.getString("eaddr"));
 
 }
 if(false)
 System.out.println("not found data");
 
 con.close();
 }
 }
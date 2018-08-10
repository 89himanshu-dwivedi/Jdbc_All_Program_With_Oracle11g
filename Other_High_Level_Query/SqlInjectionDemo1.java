import java.sql.*;
import java.util.*;
import java.io.*;

class SqlInjectionDemo1
{
public static void main(String kl[]) throws Exception
{

String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");


Statement st=con.createStatement();

Scanner sc=new Scanner(System.in);
//int c=0;


System.out.println("enter the employees name");
String ename=sc.next();

System.out.println("enter the employees addr");
String eaddr=sc.next();


String sql=String.format("select * from employess where ename='%s' and eaddr='%s'",ename,eaddr);
ResultSet rs=st.executeQuery(sql);
 
 int c=0;
 if(rs.next())
 c=rs.getInt(1);

if(c==0)
{ 
 System.out.println("invalid credentials");
}
else
{
System.out.println("valid Credential");
}

//System.out.println("total number of tableupdated"+c);

con.close();
}
}


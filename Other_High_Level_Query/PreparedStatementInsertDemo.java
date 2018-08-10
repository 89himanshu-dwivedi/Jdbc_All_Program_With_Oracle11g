import java.sql.*;
import java.util.*;
import java.io.*;

class PreparedStatementInsertDemo
{
public static void main(String kl[]) throws Exception
{

String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");

String sql="insert into employees  values (?,?,?,?)";
PreparedStatement ps=con.prepareStatement(sql);

Scanner sc=new Scanner(System.in);
int c=0;

while(true)
{
System.out.println("enter the employees id");
int id=sc.nextInt();

System.out.println("enter the employees Name");
String ename=sc.next();

System.out.println("enter the employees salary");
double esal=sc.nextDouble();

System.out.println("enter the employees Addr");
String eaddr=sc.next();

ps.setInt(1,id);
ps.setString(2,ename);
ps.setDouble(3,esal);
ps.setString(4,eaddr);


 
 int count=ps.executeUpdate();
System.out.println("data is  inserted ");
c++;
System.out.println("do you want do insert more element yes/no");
String ask=sc.next();

if(ask.equalsIgnoreCase("No"))
{
	break;
}
}
System.out.println("total number of tableupdated"+c);

con.close();
}
}


import java.sql.*;
import java.util.*;
class UpdateMultipleRowDemo
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";

Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection(url,"system","System1996");
Statement st=con.createStatement();

Scanner sc=new Scanner(System.in);

System.out.println("enter bonus salary");
double besal=sc.nextDouble();

System.out.println("enter the range of salary");
double resal=sc.nextDouble();


String sqlquery=String.format("update employees set esal=esal-%f where esal<%f",besal,resal);
int count=st.executeUpdate(sqlquery);
System.out.println("how many rows update\t"+count);
con.close();
}
}

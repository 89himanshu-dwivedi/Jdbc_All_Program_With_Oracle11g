import java.sql.*;
class UpdateSingleRowDemo
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String query="update  employees set esal=5000 where ename='alia'";
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection(url,"system","System1996");
Statement st=con.createStatement();
int count=st.executeUpdate(query);
System.out.println("how many rows update\t"+count);
con.close();
}
}

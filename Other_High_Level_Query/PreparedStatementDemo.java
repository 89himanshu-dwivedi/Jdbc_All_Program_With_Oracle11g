import java.sql.*;
import java.util.*;
import java.io.*;

class PreparedStatementDemo
{
public static void main(String kl[]) throws Exception
{

String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");

String sql="delete from employees where ename=?";
PreparedStatement ps=con.prepareStatement(sql);

ps.setString(1,"coder");
int count=ps.executeUpdate();

System.out.println("total number of table updated"+count);

System.out.println("reusing the  preparedStatement  ");
ps.setString(1,"sanu");

int count1=ps.executeUpdate();
System.out.println("total number of tableupdated"+count1);

con.close();
}
}


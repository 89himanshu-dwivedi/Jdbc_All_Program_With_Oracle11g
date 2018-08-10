import java.sql.*;
import java.util.*;
import java.io.*;

class JdbcPropertiesDemo
{
public static void main(String kl[]) throws Exception
{
Properties p=new Properties();

FileInputStream fis=new FileInputStream("db.properties");
p.load(fis);

String url=p.getProperty("url");
String user=p.getProperty("user");
String pwd=p.getProperty("pwd");

Connection con=DriverManager.getConnection(url,user,pwd);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from employees");

System.out.println("ENO\tENAME\tESAL\tEADDR");
System.out.println(".................");
while(rs.next())
{
//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+getString(4));
System.out.println(rs.getInt("eno")+"\t"+rs.getString("ename")+"\t"+rs.getDouble("esal")+"\t"+rs.getString("eaddr"));

}
con.close();

}
}
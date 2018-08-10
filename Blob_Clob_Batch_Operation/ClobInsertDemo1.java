import java.sql.*;
//import oracle.jdbc.*;
import java.util.*;
import java.io.*;

public class ClobInsertDemo1
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");

String sql="insert into usertxt values(?,?)";
PreparedStatement  pst=con.prepareStatement(sql);

//Scanner sc=new Scanner("System.in");
pst.setString(1,"Himanshu");

File f=new File("hi.txt");
FileReader fr=new FileReader(f);

pst.setCharacterStream(2,fr);

System.out.println("inserted image from"+f.getAbsolutePath());
int updateCount=pst.executeUpdate();

if(updateCount==1)
{
System.out.println("recorde inserted");
}
else
{
System.out.println("Recorded not inserted");
}

con.close();
}
}

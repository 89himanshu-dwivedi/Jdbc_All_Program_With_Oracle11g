import java.sql.*;
//import oracle.jdbc.*;
import java.util.*;
import java.io.*;

public class ClobRetrieveDemo1
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");

String sql="select * from usertxt";
PreparedStatement  pst=con.prepareStatement(sql);

ResultSet rs=pst.executeQuery();


FileWriter fw=new FileWriter("new_hi.txt");
if(rs.next())
{
String name=rs.getString(1);
Reader r=rs.getCharacterStream(2);

/*
byte[] buffer=new byte[2048];
while(is.read(buffer) > 0)
{
fos.write(buffer);
}
*/
int i=r.read();
while(i != -1)
{
fw.write(i);
}
fw.flush();
System.out.println("Image isdc avalable in new_hi");
}
con.close();
}
}

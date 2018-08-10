import java.sql.*;
//import oracle.jdbc.*;
import java.util.*;
import java.io.*;

public class BlobRetrieveDemo1
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");

String sql="select * from userimg";
PreparedStatement  pst=con.prepareStatement(sql);

ResultSet rs=pst.executeQuery();


FileOutputStream fos=new FileOutputStream("new_812.jpeg");
if(rs.next())
{
String name=rs.getString(1);
InputStream is=rs.getBinaryStream(2);
byte[] buffer=new byte[2048];
while(is.read(buffer) > 0)
{
fos.write(buffer);
}
fos.flush();
System.out.println("Image isdc avalable in new_812");
}
con.close();
}
}

import java.sql.*;
import java.util.*;
import java.text.*;

public class DataRetriveDemo1
{
public static void main(String kl[]) throws SQLException,Exception
{

String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");


PreparedStatement  ps=con.prepareStatement("select * from userdate");

ResultSet rs=ps.executeQuery();

SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy");

while(rs.next())
{
String name=rs.getString(1);
java.sql.Date sdate=rs.getDate(2);
String s=sdf.format(sdate);

System.out.println(name+"\tboth values\t"+s);
}

con.close();
}
}

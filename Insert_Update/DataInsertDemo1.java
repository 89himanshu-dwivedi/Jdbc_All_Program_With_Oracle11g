import java.sql.*;
import java.util.*;
import java.text.*;

public class DataInsertDemo1
{
public static void main(String kl[]) throws SQLException,Exception
{

String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");


Scanner sc=new Scanner(System.in);
System.out.println("enter person name");
String name=sc.next();
System.out.println("Enter DOP(dd-mm-yyyy):");
String dop=sc.next();

SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
java.util.Date udate=sdf.parse(dop);
long l=udate.getTime();
java.sql.Date sdate=new java.sql.Date(l);

String sql="insert into userdate values(?,?)";
PreparedStatement  ps=con.prepareStatement(sql);
ps.setString(1,name);
ps.setDate(2,sdate);

int rc=ps.executeUpdate();

if(rc == 0)
{
System.out.println("Record not inserted");
}
else
{
System.out.println("record is inserted");
}

con.close();
}
}

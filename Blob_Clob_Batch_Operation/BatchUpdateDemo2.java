import java.sql.*;
import oracle.jdbc.*;
import java.util.*;

class BatchUpdateDemo2
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");
PreparedStatement  pst=con.prepareStatement("insert into employees values(?,?,?,?)");


Scanner sc=new Scanner("System.in");
try
{
while(true)
{
	System.out.println("one by one rquiredment of table");
	int id        =sc.nextInt();
	String ename  =sc.next();
	double esal   =sc.nextDouble();
	String eaddr  =sc.next();
	
	
	pst.setInt(1,id);
	pst.setString(2,ename);
	pst.setDouble(3,esal);
	pst.setString(4,eaddr);
	
	pst.addBatch();
	
	System.out.println("one more data added  YES/no");
	String addmore=sc.next();
	
	if(addmore.equalsIgnoreCase("NO"))
		break;
}
pst.executeBatch();



System.out.println("the row is update successfully");
}
catch(Exception e)
{
	e.printStackTrace();
}
con.close();

}
}

import java.sql.*;
import java.util.*;


class SelectRangeOfRecordDemo2
{
public static void main(String h[]) throws Exception
{
String driver="oracle.jdbc.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:orcl";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"system","System1996");

 Statement st=con.createStatement();
 
 Scanner sc=new Scanner(System.in);
 System.out.println("enter employees begin salary");
 double bsal=sc.nextDouble();
 System.out.println("enter employees last salary");
 double lsal=sc.nextDouble();
  String sqlquery=String.format("select * from employees where esal>%f and esal<%f",bsal,lsal);
 
 Boolean flag=false;
 ResultSet rs=st.executeQuery(sqlquery);
 System.out.println("ID\tENAME\tESAL\tEADDR");
 
 while(rs.next())
 {
	 flag=true;
//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getString(4));
System.out.println(rs.getInt("id")+"\t"+rs.getString("ename")+"\t"+rs.getDouble("esal")+"\t"+rs.getString("eaddr"));
 }
 if(flag==false)
	 System.out.println("not found record");
 
 con.close();
}
}
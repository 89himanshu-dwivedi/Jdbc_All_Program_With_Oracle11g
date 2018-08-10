import java.sql.*;

class Jdbc502
{
public static void main(String k[]) throws Exception

{
String driver="oracle.jdbc.OracleDriver";
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String  user="system";
String   pass="System1996";

Class.forName(driver);
Connection con=DriverManager.getConnection(url,user,pass);

Statement st=con.createStatement();

ResultSet rs=st.executeQuery("select * from durga");

System.out.println("dsid......\t"+"dsname......\t"+"dsaddr.....\t"+"dscourse....\t");
boolean flag=false;

while(rs.next())
{
	
	flag=true;
	
System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getString(4));
}

if(flag == false)
{
	System.out.println("table and result is not fount");
}
con.close();

}
}
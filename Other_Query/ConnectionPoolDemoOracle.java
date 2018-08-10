import java.sql.*;
import javax.sql.*;
import oracle.jdbc.pool.*;

class ConnectionPoolDemoOracle
{
public static void main(String kl[]) throws Exception
{
OracleConnectionPoolDataSource cp=new OracleConnectionPoolDataSource();
cp.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
cp.setUser("system");
cp.setPassword("System1996");
Connection con=cp.getConnection();
Statement s=con.createStatement();
ResultSet rs=s.executeQuery("select * from employees");
System.out.println("ENO\t\tAME\t\tESAL\t\tEADDR");
System.out.println("................");
while(rs.next())
{
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));

}
con.close();
}
}

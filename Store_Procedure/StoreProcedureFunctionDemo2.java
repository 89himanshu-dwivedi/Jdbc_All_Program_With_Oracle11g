import java.sql.*;
import oracle.jdbc.*;
import java.util.*;

class StoreProcedureFunctionDemo2
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");


CallableStatement cst=con.prepareCall("{?=call getAllEMp(?,?)}");



cst.setInt(2,3);
cst.setInt(3,4);

cst.registerOutParameter(1,OracleTypes.CURSOR);
cst.execute();

ResultSet rs=(ResultSet)cst.getObject(1);

boolean flag=false;

System.out.println("ENO\tENAME\tESAL\tEADDR");

System.out.println("---------------");
while(rs.next())
{
flag=true;
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t"+rs.getString(4));
}
if(flag == false)
{
System.out.println("RESULT NOt Available");
}
con.close();

}
}
import java.sql.*;
import oracle.jdbc.*;
import java.util.*;

class StoreProcedureFunctionDemo1

{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");

CallableStatement cst=con.prepareCall("{?=call getAvg(?,?)}");



cst.setInt(2,3);
cst.setInt(3,4);

cst.registerOutParameter(1,Types.FLOAT);
cst.execute();

System.out.println("total salary is.."+cst.getFloat(1));
con.close();

}
}
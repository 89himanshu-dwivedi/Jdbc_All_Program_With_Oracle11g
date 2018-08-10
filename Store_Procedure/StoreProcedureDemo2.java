import java.sql.*;
class StoreProcedureDemo2
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");

CallableStatement cst=con.prepareCall("{call getSal(?,?)}");

cst.setInt(1,2);

cst.registerOutParameter(2,Types.FLOAT);
cst.execute();

System.out.println("RESULT\t"+cst.getFloat(2));
con.close();

}
}
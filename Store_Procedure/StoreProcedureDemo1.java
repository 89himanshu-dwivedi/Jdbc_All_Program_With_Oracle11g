import java.sql.*;
class StoreProcedureDemo1
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");

CallableStatement cst=con.prepareCall("{call AddProcedure(?,?,?)}");

cst.setInt(1,100);
cst.setInt(2,200);

cst.registerOutParameter(3,Types.INTEGER);
cst.execute();

System.out.println("RESULT"+cst.getInt(3));
con.close();

}
}
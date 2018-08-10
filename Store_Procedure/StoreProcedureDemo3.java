import java.sql.*;
class StoreProcedureDemo3
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");

CallableStatement cst=con.prepareCall("{call getEmpD(?,?,?)}");

cst.setInt(1,2);

cst.registerOutParameter(2,Types.VARCHAR);
cst.registerOutParameter(3,Types.FLOAT);
cst.execute();

System.out.println("RESULT\t"+cst.getString(2));
System.out.println("RESULT\t"+cst.getFloat(3));
con.close();

}
}
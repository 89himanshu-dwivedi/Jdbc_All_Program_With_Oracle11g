import java.sql.*;
class  DeleteTableDemo
{
public static void main(String hii[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String  query="drop table employees";
Connection con;
Statement st;
//Resultset rs;
Class.forName("oracle.jdbc.OracleDriver");
con=DriverManager.getConnection(url,"system","System1996");
st=con.createStatement();
st.executeUpdate(query);
System.out.println("query executede and table ");
con.close();
}
}


import java.sql.*;
class  CreateTableDemo
{
public static void main(String hii[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String  query="create table employees(id number,ename varchar2(15),esal number,eaddr varchar2(10))";
Connection con;
Statement st;
//Resultset rs;
Class.forName("oracle.jdbc.OracleDriver");
con=DriverManager.getConnection(url,"system","System1996");
st=con.createStatement();
st.executeUpdate(query);
System.out.println("query executede and table created");
con.close();
}
}


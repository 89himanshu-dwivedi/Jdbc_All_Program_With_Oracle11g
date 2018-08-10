import java.sql.*;
class  InsertSingleRowDemo
{
public static void main(String hii[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String  query="insert into employees values(1,'coder',1000,'kanpur')";
Connection con;
Statement st;

Class.forName("oracle.jdbc.OracleDriver");
con=DriverManager.getConnection(url,"system","System1996");
st=con.createStatement();
int count=st.executeUpdate(query);
System.out.println("query executede and table updated with insert values\t"+count);
con.close();
}
}


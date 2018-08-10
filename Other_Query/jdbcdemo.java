import java.sql.*;
class jdbcdemo
{
public static void main(String kl[])
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:demodsn","system","System1996");
Statement  st=con.createStatement();
ResultSet rs=st.executeQuery("select * from d1");
while(rs.next())
{
System.out.println(rs.getInt(1)+ "..."+ rs.getString(2)+"..."+rs.getString(3));
}
con.close();
}
}
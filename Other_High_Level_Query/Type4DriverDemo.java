import java.sql.*;
class Type4DriverDemo
{
public static void main(String[] ji) throws Exception
{
Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","System1996");

Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from movies");
while(rs.next())
{
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
}
con.close();
}
}
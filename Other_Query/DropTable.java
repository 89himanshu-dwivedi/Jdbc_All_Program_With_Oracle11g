import java.sql.*;
class DropTable
{
public static void main(String kl[]) throws Exception
{
 Class.forName("oracle.jdbc.OracleDriver");
 

Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl"
                ,"system","System1996");
      String q="drop table movies";
	 Statement st=con.createStatement();
ResultSet rs= st.executeQuery("select * from movies");

st.executeUpdate(q);
System.out.println("table drop successfully");
con.close();
}
}


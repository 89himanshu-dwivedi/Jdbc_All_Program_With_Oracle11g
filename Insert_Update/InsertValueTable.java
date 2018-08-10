import java.sql.*;
class InsertValueTable
{
public static void main(String kl[]) throws Exception
{
	Class.forName("oracle.jdbc.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl"
                ,"project","project");
      String q="insert into employees values (1,'himanshu',700000,'kanpur')";
	 Statement st=con.createStatement();
int updateCount= st.executeUpdate(q);
System.out.println("number of data inserted into table  successfully\t"+updateCount);

con.close();
}
}
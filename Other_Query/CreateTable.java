import java.sql.*;
class CreateTable
{
public static void main(String kl[]) throws Exception
{
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl"
                ,"project","project");
      String q="create table employees (eno number ,ename varchar2(20),esal number ,eaddr varchar2(20))";
	 Statement st=con.createStatement();
ResultSet rs= st.executeQuery(q);
System.out.println("table create successfully");

con.close();
}
}
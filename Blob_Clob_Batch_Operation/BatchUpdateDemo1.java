import java.sql.*;
import oracle.jdbc.*;
import java.util.*;

class BatchUpdateDemo1
{
public static void main(String kl[]) throws Exception
{
String url="jdbc:oracle:thin:@localhost:1521:orcl";
String driver="oracle.jdbc.OracleDriver";
Class.forName(driver);
Connection con=DriverManager.getConnection(url,"System","System1996");
Statement st=con.createStatement();

st.addBatch("insert into employees values(3,'ankur',2000.00,'hyd')");
st.addBatch("update employees  set esal=esal+1000 where id=3 ");
st.addBatch("delete employees where ename='ranjini' and esal=11000");

int[] count=st.executeBatch();
int updatecount=0;

for(int x:count)
	updatecount=updatecount+x;

System.out.println("the no of rpw update"+updatecount);

con.close();

}
}

import java.sql.*;



String query="create table durga (dsid number(10),dsname varchar2(40),dsaddr varchar2(30),dscourse varchar2(39))";
int count=st.executeUpdate(query);

System.out.println(count);

con.close();

}
}				
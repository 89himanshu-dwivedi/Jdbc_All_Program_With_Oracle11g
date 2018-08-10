import java.sql.*;  
class Mysql
{  
public static void main(String args[])
{  
try
{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/emp","root","mysql");
System.out.println("okkk"); 
}

catch(Exception e)
{
System.out.println("no");
e.printStackTrace();
}

}
} 
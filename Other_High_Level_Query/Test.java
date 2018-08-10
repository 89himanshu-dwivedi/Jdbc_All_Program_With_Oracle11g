class Test
{
public static void main(String kl[])
{
java.util.Date udate=new java.util.Date();
System.out.println("util date is \t"+udate);
long l=udate.getTime();
java.sql.Date sdate=new java.sql.Date(l);
System.out.println("sql date is \t"+sdate);
}
}
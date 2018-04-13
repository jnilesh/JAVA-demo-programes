import java.sql.*;

class SQLTest
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
		
		Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");

PreparedStatement ps = con.prepareStatement("select *from emp where code=?");
		ps.setInt(1,12);
	

	ResultSet rs = ps.executeQuery();  // select statements
		
while(rs.next())
	{	
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+
"  "+rs.getString(4));
		}
		con.close();
	}
}


/*

ps=con.prepareStatement("insert into employee values(?,?,?,?)");
ps.setInt(1,1);
ps.setString(2,"Kirti");
ps.setInt(3,12323);
ps.setString(4,"IT");
int res = ps.executeUpdate();   // DML Statements : insert/delete/update


boolean result = ps.execute();	  // DDL Statements : create / drop /alter




*/
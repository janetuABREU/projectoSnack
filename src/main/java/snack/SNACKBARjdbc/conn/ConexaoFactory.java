package snack.SNACKBARjdbc.conn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {
    // java.sql = Connection, Statement, ResultSet
    //DriverManager
    public static Connection getConexao(){
        String url= "jdbc:mysql://localhost:3306/snackbar";
        String user="root";
        String password="";
        try {
           // Connection connection=DriverManager.getConnection(url,user,password);

            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection connection){
        try {
            if (connection!=null)
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void close(Connection connection, Statement stnt){
        close(connection);
        try {
            if (stnt!= null)
                stnt.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}

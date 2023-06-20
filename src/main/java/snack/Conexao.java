
package snack;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexao {
 private Connection conexao;
    private ResultSet result;
    private Statement statement;
    private PreparedStatement preparedStatament;

    public Conexao() {
    }
    
    
    
    
    public void connect() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/snack", "root", "");
            System.out.println("Sucesso");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            System.out.println("Falhouuu");
            e.printStackTrace();
        }
    }
}


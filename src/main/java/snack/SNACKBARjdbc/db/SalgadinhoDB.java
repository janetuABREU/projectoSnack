package snack.SNACKBARjdbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import snack.SNACKBARjdbc.conn.ConexaoFactory;
import static snack.Snack.cliente;

public class SalgadinhoDB {
   
    public static void save(){

        String sql="INSERT INTO `snackbar`.`cliente` (`nome_cliente`, `endereco`, `contacto`, `codigo_cliente`) VALUES ('"+ cliente.getCliente_nome() +"','"+cliente.getEndereco()+"','"+cliente.getContacto()+"',"+cliente.getCliente_codigo()+")";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stnt= conn.createStatement();
            System.out.println(stnt.executeUpdate(sql));
            ConexaoFactory.close(conn,stnt);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
   


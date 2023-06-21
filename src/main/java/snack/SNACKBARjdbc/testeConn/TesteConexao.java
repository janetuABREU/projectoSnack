package Snack_Bar.SNACKBARjdbc.testeConn;

//import Snack_Bar.SNACKBARjdbc.classes.Cliente;
import Snack_Bar.SNACKBARjdbc.db.ClienteDB;

public class TesteConexao {
    public static void main(String[] args) {

       /* Cliente cliente = new Cliente("Joâo","945257896","Luanda",34224);
        Cliente c1= new Cliente();
        Integer clienteCodigo = c1.getCliente_codigo();
        String contacto = c1.getContacto();
        String endereco = c1.getEndereco();
        String clienteNome = c1.getCliente_nome();*/
        ClienteDB clientedb = new ClienteDB();
        clientedb.save();

    }
}

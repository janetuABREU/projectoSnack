
package snack;
import java.util.Scanner;

public class Snack {
   public static Cliente cliente = new Cliente();


    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome do cliente: ");
        String nomeCliente = scanner.nextLine();


        System.out.print("Digite o seu código: ");
        int codigoCliente = scanner.nextInt();
        System.out.print("Digite o seu Endereço: ");
       String endereco = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Digite o seu Contacto: ");
       String contacto = scanner.nextLine();

        
         cliente.setCliente_nome(nomeCliente);
        cliente.setCliente_codigo(codigoCliente);
        cliente.setEndereco(endereco);
        cliente.setContacto(contacto);
        System.out.println("Bem-vindo(a), " + cliente.getCliente_nome() + "!");
        double taxaServico=2000;

        Menu menu = new Menu();
        double valorTotal = menu.menu()+taxaServico;

        double valorPago = receberValorPago(valorTotal);
        if (valorPago == 0) {
            System.out.println("Compra não efectuada!");
        } else {
            double troco = calcularTroco(valorTotal, valorPago);
            exibirFatura(nomeCliente, codigoCliente, valorTotal, valorPago, troco,taxaServico);
            scanner.close();
        }

    }



   public static double receberValorPago(double valorTotal) {

        for (; ; ) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o valor pago: ");
            double valorPago = scanner.nextDouble();

            if (valorPago < valorTotal) {
                System.out.println("O valor pago é inferior ao valor total!");
                System.out.println("\n Deseja: ");
                System.out.println("1- Sair | 2- Digitar outro valor");
                int op=scanner.nextInt();
                if (op==1){return 0;}
                else {continue;}
            } else {
                return valorPago;
            }

        }
    }

    public static double calcularTroco(double valorTotal, double valorPago) {
        return valorPago - valorTotal;
    }

    public static void exibirFatura(String nomeCliente, int codigoCliente, double valorTotal, double valorPago, double troco, double taxaServico) {
        System.out.println("===== FATURA =====");

        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Codigo do Cliente: " + codigoCliente);

        System.out.println("Pedidos: ");
        int i = 0;
        for (Prato iten : Menu.itensConsumidos) {
            System.out.print((i + 1) + "- ");
            i++;
            System.out.println(iten.toString());
        }
        System.out.println("taxa serviço:kz"+ taxaServico);
        System.out.println("Valor total: kz " + valorTotal);
        System.out.println("Valor pago: kz " + valorPago);
        System.out.println("Troco: kz" + troco);
        
        System.out.println("==================");
    }


}

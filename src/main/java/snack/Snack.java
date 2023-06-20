
package snack;
import java.util.Scanner;

public class Snack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome do cliente: ");
        String nomeCliente = scanner.nextLine();


        System.out.print("Digite o seu cÃ³digo: ");
        int codigoCliente = scanner.nextInt();
        Cliente cliente = new Cliente(nomeCliente, codigoCliente);

        System.out.println("Bem-vindo(a), " + cliente.getNome() + "!");

        Menu menu = new Menu();
        double valorTotal = menu.menu();

        double valorPago = receberValorPago(valorTotal);
        if (valorPago == 0) {
            System.out.println("Compra nÃ£o efectuada!");
        } else {
            double troco = calcularTroco(valorTotal, valorPago);
            exibirFatura(nomeCliente, codigoCliente, valorTotal, valorPago, troco);
            scanner.close();
        }

    }



    public static double receberValorPago(double valorTotal) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();
        if (valorPago < valorTotal) {
            System.out.println("O valor pago Ã© inferior ao valor total!");
            return 0;
        } else {
            return valorPago;
        }
    }

    public static double calcularTroco(double valorTotal, double valorPago) {
        return valorPago - valorTotal;
    }

    public static void exibirFatura(String nomeCliente, int codigoCliente, double valorTotal, double valorPago, double troco) {
        System.out.println("===== FATURA =====");

        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Codigo do Cliente: " + codigoCliente);

        System.out.println("Pedidos: ");
        int i = 0;
        for (Prato iten : Menu.itensConsumidos) {
            System.out.print((i + 1) + "- ");
            System.out.println(iten.toString());
        }
        System.out.println("Valor total: kz " + valorTotal);
        System.out.println("Valor pago: kz " + valorPago);
        System.out.println("Troco: kz" + troco);
        System.out.println("==================");
    }


}

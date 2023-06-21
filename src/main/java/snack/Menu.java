
      
package snack;

import java.util.ArrayList;
import java.util.Scanner;

public class    Menu{

    static double valorBase = 0.0;
    static ArrayList<Prato> itensConsumidos = new ArrayList<Prato>();


    public double menu() {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {

            System.out.println("Menu:");
            System.out.println("1 - Pizza ");
            System.out.println("2 - Lanche");
            System.out.println("3 - Salgados");
            double preco=0;
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    valorBase += 10000 * menuPizza();
                    
                    break;
                case 2:
                    valorBase += 3000 * menuLanche();
                    break;
                case 3:
                    valorBase += 1500 * menuSalgadinho();
                    break;
                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida.");
                    break;
            }
            System.out.println("deseja outro item?\n 1- Sim | 2- NÃ£o");
            opcao = scanner.nextInt();
        } while (opcao == 1);
        return valorBase;
    }

    /**
     * MENU PIZZA
     */
    public double menuPizza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Pizza:");
        System.out.println("1 - Recheio");
        System.out.println("2 - Molho");
        System.out.println("3 - Cobertura");

        String recheio = "1", molho, cobertura = "";
        /**Definindo o tipo de Recheio*/
        System.out.println("\nEscolha o Tipo de Recheio:");
        System.out.println("1 - BACON,PIMENTA,CARNE MOIDA");
        System.out.println("2 - Frango.j,tomate");
        System.out.println("3 - doce");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                recheio = "carne";
                break;
            case 2:
                recheio = "frango";
                break;
            case 3:
                recheio = "doce";
                break;
            default:
                System.out.println("OpÃ§Ã£o invÃ¡lida, Recheio nÃ£o definido!");
                break;
        }
        /**definindo o tipo de Molho*/
        System.out.println("\nEscolha o Tipo de Molho:");
        System.out.println("1 - Molho de tomate");
        System.out.println("2 - Molho pesto(manteiga,natas,queijos e pimenta)");
        System.out.println("3 - Molho branco/Bechamel");
        System.out.println("4 - Sem molho");
        int op1 = scanner.nextInt();
        switch (op1) {
            case 1:
                molho = "Molho 1";
                break;
            case 2:
                molho = "Molho 2";
                break;
            case 3:
                molho = "Molho 3";
                break;
            default:
                molho = "Sem Molho";
                break;
        }
        /**definindo o tipo de Cobertura*/
        System.out.println("\nEscolha o Tipo de Cobertura:");
        System.out.println("1 - queijo ralado");
        System.out.println("2 - Oregano");
        System.out.println("3 - presunto,azeitonas");
        int op2 = scanner.nextInt();
        switch (op) {
            case 1:
                cobertura = "Cobertura 1";
                break;
            case 2:
                cobertura = "Cobertura 2";
                break;
            case 3:
                cobertura = "Cobertura 3";
                break;
            default:
                System.out.println("OpÃ§Ã£o invÃ¡lida, tipo de Cobertura nÃ£o definido!");
                break;
        }
        Pizza pizza = new Pizza(molho, recheio, cobertura);
        pizza.setPeso(1.00);
        pizza.setPreco(10000*pizza.getPeso());
        itensConsumidos.add(pizza);
        return pizza.getPeso();
    }

    /**
     * MENU LANCHE
     */
    public double menuLanche() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Lanche:");
        System.out.println("1 - Recheio");
        System.out.println("2 - Molho");
        System.out.println("3 - Pão");

        String recheio = "", molho, pao = "";
        /**Definindo o tipo de Recheio*/
        System.out.println("\nEscolha o Tipo de Recheio:");
        System.out.println("1 - frango");
        System.out.println("2 - carne");
        System.out.println("3 - Queijo, BACON 3");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                recheio = "FRANGO";
                break;
            case 2:
                recheio = "CARNE";
                break;
            case 3:
                recheio = "QUEIJO";
                break;
            default:
                System.out.println("OpÃ§Ã£o invÃ¡lida, Recheio nÃ£o definido!");
                break;
        }
        /**definindo o tipo de Molho*/
        System.out.println("\nEscolha o Tipo de Molho:");
        System.out.println("1 - MAIONESE");
        System.out.println("2 - MOSTARDA");
        System.out.println("3 - MOLHO BRAMCO");
        System.out.println("4 - Sem molho");
        int op1 = scanner.nextInt();
        switch (op1) {
            case 1:
                molho = "MAIONESE";
                break;
            case 2:
                molho = "MOSTARDA";
                break;
            case 3:
                molho = "MOLHO BRANCO";
                break;
            default:
                molho = "Sem Molho";
                break;
        }
        /**definindo o tipo de PÃ£o*/
        System.out.println("\nEscolha o Tipo de PÃ£o:");
        System.out.println("1 - PÃO SEM GLUTEM");
        System.out.println("2 - PÃO INTEGRAL");
        System.out.println("3 - PÃO DE FORMA");
        int op2 = scanner.nextInt();
        switch (op) {
            case 1:
                pao = "PÃO SEM GLUTEM";
                break;
            case 2:
                pao = "PÃO INTEGRAL";
                break;
            case 3:
                pao = "PÃO DE FORMA";
                break;
            default:
                System.out.println("OpÃ§Ã£o invÃ¡lida, tipo de PÃ£o nÃ£o definido!");
                break;
        }
        Lanche lanche = new Lanche(pao, recheio, molho);
        lanche.setPeso(0.400);
         lanche.setPreco(3000*0.400);
        itensConsumidos.add(lanche);
        return lanche.getPeso();
    }

    /**
     * MENU SALGADINHO
     */

    public double menuSalgadinho() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Salgadinho:");
        System.out.println("1 - Recheio");
       // System.out.println("2 - Massa");
        System.out.println("3 - Tipo do Salgadinho");

        String recheio = "", massa = "", tipo = "";
        /**Definindo o tipo de Recheio*/
        System.out.println("\nEscolha o Tipo de Recheio:");
        System.out.println("1 - FRANGO");
        System.out.println("2 - CAMARÃO ");
        System.out.println("3 - CARNE");
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                recheio = "FRANGO";
                break;
            case 2:
                recheio = "CAMARÃO";
                break;
            case 3:
                recheio = "CARNE";
                break;
            default:
                System.out.println("OpÃ§Ã£o invÃ¡lida, Recheio nÃ£o definido!");
                break;
        }
        /**definindo o tipo de Massa*/
      /*  System.out.println("\nEscolha o Tipo de Massa:");
        System.out.println("1 - Massa 1");
        System.out.println("2 - Massa 2");
        System.out.println("3 - Massa 3");
        int op1 = scanner.nextInt();
        switch (op1) {
            case 1:
                massa = "Massa 1";
                break;
            case 2:
                massa = "Massa 2";
                break;
            case 3:
                massa = "Massa 3";
                break;
            default:
                System.out.println("OpÃ§Ã£o invÃ¡lida, tipo de Massa nÃ£o definido!");
                break;
        }*/
        /**definindo o tipo de Salgadinho*/
        System.out.println("\nEscolha o Tipo de Salgadinho:");
        System.out.println("1 - Frito");
        System.out.println("2 - Assado");
        int op2 = scanner.nextInt();
        switch (op) {
            case 1:
                tipo = "Frito";
                break;
            case 2:
                tipo = "Assado";
                break;
            default:
                System.out.println("OpÃ§Ã£o invÃ¡lida, tipo de Salgadinho nÃ£o definido!");
                break;
        }
        Salgadinho salgadinho = new Salgadinho(tipo, recheio);
        salgadinho.setPeso(0.200);
         salgadinho.setPreco(1500*0.200);
        itensConsumidos.add(salgadinho);
        return salgadinho.getPeso();
    }


}

 
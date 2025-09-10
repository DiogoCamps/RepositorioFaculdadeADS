import java.util.Scanner;

public class Preco {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         String nome1;
         double precoAnterior1;
         double precoAtual1;
         double variacao1;
         String situacao1;
         String nome2;
         double precoAnterior2;
         double precoAtual2;
         double variacao2;
         String situacao2;
         String nome3;
         double precoAnterior3;
         double precoAtual3;
         double variacao3;
         String situacao3;

        System.out.println("Digite o nome do primeiro produto:");
        nome1 = scanner.nextLine();
        System.out.println("Digite o preço anterior do primeiro produto:");
        precoAnterior1 = scanner.nextDouble();
        System.out.println("Digite o preço atual do primeiro produto:");
        precoAtual1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o nome do segundo produto:");
        nome2 = scanner.nextLine();
        System.out.println("Digite o preço anterior do segundo produto:");
        precoAnterior2 = scanner.nextDouble();
        System.out.println("Digite o preço atual do segundo produto:");
        precoAtual2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o nome do terceiro produto:");
        nome3 = scanner.nextLine();
        System.out.println("Digite o preço anterior do terceiro produto:");
        precoAnterior3 = scanner.nextDouble();
        System.out.println("Digite o preço atual do terceiro produto:");
        precoAtual3 = scanner.nextDouble();


        variacao1 = ((precoAtual1 - precoAnterior1) / precoAnterior1) * 100;
        if (variacao1 > 0) {
            situacao1 = "AUMENTO";
            if (variacao1 > 10) {
                situacao1 = "AUMENTO ABUSIVO";
            }
        }else if(variacao1 < 0) {
            situacao1 = "QUEDA";
        }else {
            situacao1 = "ESTÁVEL";
        }

        variacao2 = ((precoAtual2 - precoAnterior2) / precoAnterior2) * 100;
        if (variacao2 > 0) {
            situacao2 = "AUMENTO";
            if (variacao2 > 10) {
                situacao2 = "AUMENTO ABUSIVO";
            }
        }else if (variacao2 < 0) {
            situacao2 = "QUEDA";
        } else {
            situacao2 = "ESTÁVEL";
        }

        variacao3 = ((precoAtual3 - precoAnterior3) / precoAnterior3) * 100;
        if (variacao3 > 0) {
            situacao3 = "AUMENTO";
            if (variacao3 > 10) {
                situacao3 = "AUMENTO ABUSIVO";
            }
        }else if(variacao3 < 0) {
            situacao3 = "QUEDA";
        }else {
            situacao3 = "ESTÁVEL";
        }
        System.out.println("--- Relatório do Produto 1 ---");
        System.out.println("Nome: " + nome1);
        System.out.println("Preço Anterior: " + precoAnterior1);
        System.out.println("Preço Atual: " + precoAtual1);
        System.out.println("Variação de preço: R$" + variacao1);
        System.out.println("Situação: " + situacao1 + " de preço");

        System.out.println("--- Relatório do Produto 2 ---");
        System.out.println("Nome: " + nome2);
        System.out.println("Preço Anterior: " + precoAnterior2);
        System.out.println("Preço Atual: " + precoAtual2);
        System.out.println("Variação de preço: R$" + variacao2);
        System.out.println("Situação: " + situacao2 + " de preço");

        System.out.println("--- Relatório do Produto 3 ---");
        System.out.println("Nome: " + nome3);
        System.out.println("Preço Anterior: " + precoAnterior3);
        System.out.println("Preço Atual: " + precoAtual3);
        System.out.println("Variação de preço: R$" + variacao3);
        System.out.println("Situação: " + situacao3 + " de preço");

    }
}

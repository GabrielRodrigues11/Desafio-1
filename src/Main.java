import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variaveis usuario

        String nome = "Gabriel Rodrigues";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;

        //Menu

        System.out.println("***********************");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println(("***********************"));

        String menu = """
                \nOperações
                1 - Consultar Saldos
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                Digite a opção desejada:
                """;

        //Variaveis Valores

        int opcao = 0;
        double receber = 0;
        double transferir = 0;
        Scanner leitura = new Scanner(System.in);
        while(opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            //Calculos de opções

            if (opcao == 1){
                System.out.println("O saldo atual é " + saldo);
            } else if (opcao == 2){
                System.out.println("Digite o valor desejado para receber: ");
                receber = leitura.nextDouble();
                saldo = saldo + receber;
                System.out.println("Valor recebido: " + receber);
            } else if (opcao == 3){
                System.out.println("Digite o valor desejado para transferir: ");
                transferir = leitura.nextDouble();
                if (transferir > saldo){
                    System.out.println("Saldo não é suficiente para realizar essa operação");
                } else {
                    saldo = saldo - transferir;
                    System.out.println("Transferencia de " + transferir + " concluida!");
                }
            } else if(opcao < 1 || opcao > 4) {
                System.out.println("Comando inválido!");
            } else {
                System.out.println("Obrigado por utilizar nossos serviços!");
                break;
            }
        }

    }

}
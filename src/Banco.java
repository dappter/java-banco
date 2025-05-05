import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "José Guilherme";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.00;

        System.out.println("***********************");
        System.out.println("""
                Dados iniciais do cliente: 
                
                \nNome: """ + nome +
                """ 
                \nTipo de Conta: """ + tipoConta +
                """
                \nSaldo inicial: R$""" + saldoInicial +
                """
                
                """);

        System.out.println("***********************");

        int escolha = 0;

        while (escolha != 4) {
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair\n
                    
                    Digite a opção desejada:""");

            escolha = scanner.nextInt();
            double valorDigitado = 0;
            double valorDigitadoTransferencia = 0;

            if (escolha == 1){
                System.out.println("Saldo atual: R$" + saldoInicial);
            } else if (escolha == 2) {

                System.out.println("Escolha o valor que quer receber: ");
                valorDigitado = scanner.nextInt();

                saldoInicial += valorDigitado;

                System.out.println("Saldo atual: R$" + saldoInicial);
            } else if (escolha == 3) {
                System.out.println("Digite o valor que deseja transferir:");
                double valorTransferencia = scanner.nextDouble();
                if (valorTransferencia > saldoInicial) {
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                } else {
                    saldoInicial -= valorTransferencia;
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Saldo atual: R$" + saldoInicial);
                }
            } else if (escolha == 4) {
                break;
            }
            else {
                System.out.println("Valor inválido, tente novamente !");
            }
        }
    }
}

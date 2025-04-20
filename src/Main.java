import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCliente = "Bruna Asquel Giovanella";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.printf("""
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo Conta:     %s
                Saldo Inicial:  %.2f
                \n""", nomeCliente, tipoConta, saldo);

        boolean sistemaAtivo = true;

        while (sistemaAtivo) {
            System.out.print("""
                    \nOperações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    
                    Ação desejada: """);

            int decisaoDoCliente = sc.nextInt();

            switch (decisaoDoCliente) {
                case 1: // saldo atual
                    System.out.println("\nSeu saldo atual é de :" + saldo);
                    break;

                case 2: // receber valor
                    System.out.print("\nInforme o valor que será debitado: R$ ");
                    double valorDebito = sc.nextDouble();
                    if (valorDebito < 0) {
                        System.out.println("Valor Inválido");
                    } else {
                        saldo += valorDebito;
                    }
                    break;

                case 3: // transferir valor
                    System.out.print("\nInforme o valor que será creditado: R$ ");
                    double valorCredito = sc.nextDouble();
                    if (valorCredito > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorCredito;
                    }
                    break;

                case 4: // sair
                    System.out.println("\nSaindo...");
                    sistemaAtivo = false;
                    break;
            }
        }

    }
}
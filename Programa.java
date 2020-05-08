import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List listaContas = new ArrayList<ContaBancaria>();

        // ContaBancaria contaUm = new ContaBancaria("JC", novaConta());
        // ContaBancaria contaDois = new ContaBancaria("Andrei", novaConta());
        // ContaBancaria contaTres = new ContaBancaria("Beatriz", novaConta());
        // listaContas.add(contaUm);
        // listaContas.add(contaDois);
        // listaContas.add(contaTres);

        int opcaoSelecionada;
        do {

            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Criar conta: ");
            System.out.println("2 - Listar todas as contas: ");
            System.out.println("3 - Transferencia: ");
            System.out.println("4 - Saldo: ");
            System.out.println("5 - Deposito: ");
            System.out.println("0 - Sair ");
            opcaoSelecionada = leitor.nextInt();

            int contaescolhida;
            int contaorigem;
            int contadestino;
            switch (opcaoSelecionada) {
                // Criar Conta
                case 1:
                    System.out.println("[Digite Nome do Correntista]: ");
                    String nome = leitor.next().trim();
                    ContaBancaria novaContaBancaria = new ContaBancaria(nome, novaConta());
                    listaContas.add(novaContaBancaria);
                    break;
                // Listar Todas as Contas
                case 2:
                    for (int contador = 0; contador < listaContas.size(); contador++) {

                        ContaBancaria contaTemporaria = (ContaBancaria) listaContas.get(contador);
                        System.out.println("[Nome do Correntista]: " + contaTemporaria.getNome());
                        System.out.println("[Saldo do Correntista]: " + contaTemporaria.exibirSaldo());
                        System.out.println("[Conta do Correntista]: " + contaTemporaria.getConta());
                        System.out.println("-------------------------------------------------------");
                    }
                    break;
                case 5:
                for (int contador = 0; contador < listaContas.size(); contador++) {

                    ContaBancaria contaTemporaria = (ContaBancaria) listaContas.get(contador);
                    System.out.println("[Nome do Correntista]: " + contaTemporaria.getNome());
                    System.out.println("[Conta do Correntista]: " + contaTemporaria.getConta());
                    System.out.println("-------------------------------------------------------");                   
                }
                    System.out.println("Escolha a conta desejada: ");
                    contaescolhida = leitor.nextInt();
                    ContaBancaria contaTemporaria2 = (ContaBancaria) listaContas.get(contaescolhida-1);
                    System.out.println("Escolha o valor a depositar: ");
                    double valordeposito = leitor.nextInt();
                    contaTemporaria2.depositar(valordeposito);
                    System.out.println("[Nome do Correntista]: " + contaTemporaria2.getNome());
                    System.out.println("[Saldo do Correntista]: " + contaTemporaria2.exibirSaldo());
                    System.out.println("[Conta do Correntista]: " + contaTemporaria2.getConta());
                    System.out.println("-------------------------------------------------------");

                    break;
                case 3:
                //transferencia
                for (int contador = 0; contador < listaContas.size(); contador++) {

                    ContaBancaria contaTemporaria = (ContaBancaria) listaContas.get(contador);
                    System.out.println("[Nome do Correntista]: " + contaTemporaria.getNome());
                    System.out.println("[Conta do Correntista]: " + contaTemporaria.getConta());
                    System.out.println("-------------------------------------------------------");                   
                }
                    System.out.println("Escolha a conta desejada de origem: ");
                    contaorigem = leitor.nextInt();
                    System.out.println("Escolha a conta desejada de destino: ");
                    contadestino = leitor.nextInt();
                    ContaBancaria contaorigemtemp = (ContaBancaria) listaContas.get(contaorigem-1);
                    ContaBancaria contadestinotemp = (ContaBancaria) listaContas.get(contadestino-1);

                    System.out.println("Escolha o valor a depositar: ");
                    double valortransf = leitor.nextInt();
                    contaorigemtemp.sacar(valortransf);
                    contadestinotemp.depositar(valortransf);
                    System.out.println("[Transferencia Realizada com Sucesso]");
                    System.out.println("[Nome do Correntista]: " + contaorigemtemp.getNome());
                    System.out.println("[Saldo do Correntista]: " + contaorigemtemp.exibirSaldo());
                    System.out.println("[Conta do Correntista]: " + contaorigemtemp.getConta());
                    System.out.println("-------------------------------------------------------");
                    System.out.println("[Nome do Correntista]: " + contadestinotemp.getNome());
                    System.out.println("[Saldo do Correntista]: " + contadestinotemp.exibirSaldo());
                    System.out.println("[Conta do Correntista]: " + contadestinotemp.getConta());
                    System.out.println("-------------------------------------------------------");

                break;
                case 4:
                    System.out.println("Escolha a conta para verificar o saldo: ");
                    contaorigem = leitor.nextInt();
                    ContaBancaria contasaldo = (ContaBancaria) listaContas.get(contaorigem-1);
                    System.out.println("[Nome do Correntista]: " + contasaldo.getNome());
                    System.out.println("[Saldo do Correntista]: " + contasaldo.exibirSaldo());
                    System.out.println("[Conta do Correntista]: " + contasaldo.getConta());
                    System.out.println("-------------------------------------------------------");

                break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Invalida - Digite");
                    break;
            }
        } while (opcaoSelecionada != 0);

        leitor.close();
    }
    public static int ids = 0;

    public static int novaConta() {
        return ids += 1;
    }

}
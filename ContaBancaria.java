import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private String nome;
    private Double saldo;
    private final Integer conta;

    public static boolean validaconta( int conta, ArrayList<ContaBancaria> listaContas) {
        for (int i = 0, n = 0; i < listaContas.size() && n != 1; i++) {
             ContaBancaria contaorigem = (ContaBancaria) listaContas.get(i);
            if (conta == contaorigem.getConta()) {
                System.out.println("Conta existe");
                System.out.println("[Nome do Correntista]: " + contaorigem.getNome());
                System.out.println("[Conta do Correntista]: " + contaorigem.getConta());
                n++;
                return true;
            } else {
                System.out.println("Conta nao existe");
                return false;
            }
        }
        return false;
    }

    public void setNome(final String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getConta() {
        return conta;
    }

    public void setSaldo(final Double novoSaldo) {
        saldo = novoSaldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public ContaBancaria(final String nomeCorrentista, final Integer numeroConta) {
        nome = nomeCorrentista;
        saldo = 0.0;
        conta = numeroConta;
    }

    public Double exibirSaldo() {
        return saldo;
    }

    public void depositar(final Double valorDepositado) {
        saldo += valorDepositado;
    }

    public void sacar(final Double valorSacado) {
        saldo -= valorSacado;
    }

}
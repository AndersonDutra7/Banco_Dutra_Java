public class Conta {

    public int numero;
    public double saldo;
    public double limite = 100.00;

    @Override
    public String toString() {

        return "Conta: " + numero + " Saldo: R$" + saldo + " Limite: R$" + limite;
    }

    public void depositar(double valor){

        this.saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo + this.limite) {
            this.saldo -= valor;
        } else {
            System.out.println("Valor indisponível para saque!");
        }
    }

    public void imprimirExtrato(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: R$ " + this.saldo);
        System.out.println("Limite: R$ " + this.limite);
        System.out.println("Saldo Total: R$ " + (limite + saldo));
    }

    public double consultarSaldoDisponivel(){
        saldo = saldo + limite;
        return this.saldo;
    }

}

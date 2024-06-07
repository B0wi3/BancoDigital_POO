public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco("Santander");

        Cliente leo = new Cliente("Léo", "111.222.333-40");
        Cliente ana = new Cliente("Ana", "999.888.777-50");
        Cliente bea = new Cliente ("Bea", "555.777.333-80");

        Conta cc = new ContaCorrente(leo);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(leo);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

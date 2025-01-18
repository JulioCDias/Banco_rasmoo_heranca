public class TesteAbstract {
    public static void main(String[] args) {
        Cliente julio = new Cliente("julio","987978978");
        //Conta conta = new Conta(1000, 3333, julio);

        ContaCorrente cc = new ContaCorrente(1, 1234, julio);
        ContaPoupanca cp = new ContaPoupanca(1, 4321, julio);

        cc.gerarExtrato();
        cp.gerarExtrato();
    }
}

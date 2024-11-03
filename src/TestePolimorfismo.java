public class TestePolimorfismo {
    public static void main(String[] args) {
        Cliente julio = new Cliente("Julio", "1234567899");
        ContaCorrente cc = new ContaCorrente(1,1234, julio);
        ContaPoupanca cp = new ContaPoupanca(1,4321, julio);

        cc.depositar(1000);
        cp.depositar(10000);

        cc.sacar(100); //Recebdo o Overrride (Conseito de  Polimorfismo)
        cp.sacar(100);

        cp.transferir(500, cc);
        cc.transferir(500, cp);//Cuidado ao usar Override pois a nova implementação fica em todo o codigo

        System.out.println("O saldo da Conta Corrente é: "+cc.getSaldo());
        System.out.println("O saldo da Conta Poupança é: "+cp.getSaldo());
        System.out.println("O saldo da Conta Poupança é: "+cp.getSaldo());
    }
}

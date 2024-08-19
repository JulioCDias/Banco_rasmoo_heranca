public class TesteHeranca {
    public static void main(String[] args) {
        Cliente julio = new Cliente("Julio", "15678878");
        ContaCorrente contaC = new ContaCorrente(1,876, julio);

        ContaPoupanca contaP = new ContaPoupanca(1, 87667, julio);

        contaC.depositar(1000);
        contaC.transferir(500, contaP);
        System.out.println(contaC.getSaldo());
        System.out.println(contaP.getSaldo());
    }
}

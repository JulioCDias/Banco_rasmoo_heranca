public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, Cliente titular){ //Feito desta maneira pois nao tem contrutor padrao
        super(agencia, numero, titular); //Super utilizar o construtor de sua classe pai no caso CONTA
    }

    @Override //Overrride é o sobre escrita, ou seja vou sobre escrever o methodo original com algumas implementaçoes
    boolean sacar(double valor) {
        double novoValor = valor + 0.05;
        return super.sacar(novoValor);
    }
}

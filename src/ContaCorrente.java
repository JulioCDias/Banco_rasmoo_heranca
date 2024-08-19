public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, Cliente titular){ //Feito desta maneira pois nao tem contrutor padrao
        super(agencia, numero, titular); //Super utilizar o construtor de sua classe pai no caso CONTA
    }
}

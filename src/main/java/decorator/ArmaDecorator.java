package decorator;

public abstract class ArmaDecorator extends Arma{
    Arma armaBase;

    public ArmaDecorator(Arma arma){
        armaBase = arma;
    }

    @Override
    public String getNome() {
        return armaBase.getNome() + " + " + nome;
    }
}

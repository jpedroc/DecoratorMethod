package decorator;

public class Silenciador extends ArmaDecorator {
    public Silenciador(Arma arma){
        super(arma);
        nome = "Silenciador";
        tipo = "Modificação";
    }

}

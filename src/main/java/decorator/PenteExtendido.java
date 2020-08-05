package decorator;

public class PenteExtendido extends ArmaDecorator {
    public PenteExtendido(Arma arma){
        super(arma);
        nome = "Pente Extendido";
        tipo = "Modificação";
    }

}

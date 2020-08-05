package decorator;

public class Decorator {

    public static void main(String[] args){

        // Criando uma arma base
        Arma minhaArma = new Glock18();
        System.out.println(minhaArma.getNome());

        // Adicionando alguns modificadores nela
        minhaArma = new Silenciador(minhaArma);
        System.out.println(minhaArma.getNome());

        // Adicionando alguns modificadores
        minhaArma = new MiraRedDot(minhaArma);
        System.out.println(minhaArma.getNome());

        Arma minhaArma2 = new AK47();
        System.out.println(minhaArma2.getNome());

        minhaArma2 = new PenteExtendido(minhaArma2);
        System.out.println(minhaArma2.getNome());

        minhaArma2 = new MiraRedDot(minhaArma2);
        System.out.println(minhaArma2.getNome());

        Arma minhaArma3 = new AWM();
        System.out.println(minhaArma3.getNome());

        minhaArma3 = new Silenciador(minhaArma3);
        System.out.println(minhaArma3.getNome());

        minhaArma3 = new PenteExtendido(minhaArma3);
        System.out.println(minhaArma3.getNome());

    }
}

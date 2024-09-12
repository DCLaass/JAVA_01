public class TestaAutomovel {
    public static void main(String[] args) {
    Automovel a1 = new Automovel("Prata", "Fiat",61,80);
    Automovel a2 = new Automovel("Cinza", "Honda",68,120);

    System.out.printf("%d\n", a1.retornaVelocidade());
    System.out.printf("%d\n", a2.retornaVelocidade());

    }
}

public class CorrecaoEx01 {
    public static void main(String[] args) {
        Integer quatidadeBebes = 2;
        Integer quantidadeCriancas = 3;
        Integer quantidadeJovens = 1;

        Double valorBebes = 25.12;
        Double valorCriancas = 15.88;
        Double valorJovens = 12.44;

        System.out.println("Você tem um total de "+ (quatidadeBebes + quantidadeCriancas + quantidadeJovens) +
                " filhos e vai receber R$ "+ (
                (quatidadeBebes * valorBebes) +
                (quantidadeCriancas * valorCriancas)+
                (quantidadeJovens * valorJovens)
                ) +" de bolsa");

    }
}

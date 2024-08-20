public class TesteEncomendas {
    public static void main(String[] args) {


        Encomenda encomenda1 = new Encomenda("M",
                "Haddock Lobo",
                "Bela Cintra",
                42.2,
                87.50);

        encomenda1.setTamanho("G");
        System.out.println(String.format("""
                Tamanho: %s
                Remetente: %s
                Destinatário: %s
                Distância: %.2f
                Valor: R$ %.2f
                """, encomenda1.getTamanho(), encomenda1.getEnderecoRemetente(), encomenda1.getEnderecoDestinatario(), encomenda1.getDistancia(), encomenda1.getValorProduto()));

        System.out.println(encomenda1.getTamanho());


    }
}

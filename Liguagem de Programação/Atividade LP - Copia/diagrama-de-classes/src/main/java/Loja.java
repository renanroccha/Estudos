public class Loja {

    // atributos, construtores, metodos da classe, get&set, to string

        private String nomeLoja;

        private Integer qtdVendas;

        private Integer qtdMetaVendas;

        private Double valorTotalVendas;


    public Loja(String nomeLoja, Integer qtdVendas, Integer qtdMetaVendas, Double valorTotalVendas) {
        this.nomeLoja = nomeLoja;
        this.qtdVendas = 0;
        this.qtdMetaVendas = qtdMetaVendas;
        this.valorTotalVendas = 0.0;
    }

    public void realizarVenda (Double valorVenda){
        setValorTotalVendas(getValorTotalVendas()+valorVenda);
    }

    public void realizarVenda(Double valorVenda, Double valorDesconto){
        Double total = valorVenda - valorDesconto;
    }

    Boolean verificarMeta (){

        return getQtdVendas() >= getQtdMetaVendas() ? true : false;
    }


    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Integer getQtdMetaVendas() {
        return qtdMetaVendas;
    }

    public void setQtdMetaVendas(Integer qtdMetaVendas) {
        this.qtdMetaVendas = qtdMetaVendas;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }


    // toString

    @Override
    public String toString() {
        return "Loja{" +
                "nomeLoja='" + nomeLoja + '\'' +
                ", qtdVendas=" + qtdVendas +
                ", qtdMetaVendas=" + qtdMetaVendas +
                ", valorTotalVendas=" + valorTotalVendas +
                ", Meta alcançada: =" + verificarMeta() +
                '}';
    }
}

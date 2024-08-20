public class Encomenda {


    // atributos
    private String tamanho;

    private String enderecoRemetente;

    private String enderecoDestinatario;

    private Double distancia;

    private Double valorProduto;


    // construtor

    public Encomenda (String tamanho, String enderecoRemetente, String enderecoDestinatario, Double distancia, Double valorProduto) {
        this.tamanho = tamanho;
        this.enderecoRemetente = enderecoRemetente;
        this.enderecoDestinatario = enderecoDestinatario;
        this.distancia = distancia;
        this.valorProduto = valorProduto;
    }


    // GET & SET
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getEnderecoRemetente() {
        return enderecoRemetente;
    }

    public void setEnderecoRemetente(String enderecoRemetente) {
        this.enderecoRemetente = enderecoRemetente;
    }

    public String getEnderecoDestinatario() {
        return enderecoDestinatario;
    }

    public void setEnderecoDestinatario(String enderecoDestinatario) {
        this.enderecoDestinatario = enderecoDestinatario;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }
}

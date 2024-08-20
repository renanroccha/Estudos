public class Bolo {

    // atributos

    private String sabor;

    private Double valor;

    private Integer quantidadeVendida;

    private Integer quantidadeEmEstoque;



    public Bolo (String sabor, Double valor, Integer quantidadeVendida, Integer quantidadeEmEstoque){

        this.sabor = sabor;
        this.valor = valor;
        this.quantidadeVendida = quantidadeVendida;
        this.quantidadeEmEstoque = quantidadeEmEstoque;

    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public Integer getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}

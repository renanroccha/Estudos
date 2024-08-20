public class Pet {

    // ATRIBUTOS
    private String nome;

    private Integer qtdBanhosTomados;

    private Double valorGastoEmPetShops;


    // CONSTRUTOR
    public Pet(String nome) {
        this.nome = nome;
        this.qtdBanhosTomados = 0;
        this.valorGastoEmPetShops = 0.0;
    }


    // GET & SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdBanhosTomados() {
        return qtdBanhosTomados;
    }

    public void setQtdBanhosTomados(Integer qtdBanhosTomados) {
        this.qtdBanhosTomados = qtdBanhosTomados;
    }

    public Double getValorGastoEmPetShops() {
        return valorGastoEmPetShops;
    }

    public void setValorGastoEmPetShops(Double valorGastoEmPetShops) {
        this.valorGastoEmPetShops = valorGastoEmPetShops;
    }
}

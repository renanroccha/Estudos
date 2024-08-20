public class PetShop {
    private String nome;
    private Double faturamento;

    public PetShop(String nome, Double faturamento) {
        this.nome = nome;
        this.faturamento = faturamento;
    }

    public PetShop(String nome) {
        this.nome = nome;
        faturamento = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(Double faturamento) {
        this.faturamento = faturamento;
    }


    public void darBanho(Pet animal){

     darBanho(animal, 0.0);
    }

    public void darBanho(Pet animal, Double desconto){

        Double valorBanho = 90.0 - desconto;

        faturamento += valorBanho;

       animal.tomarBanho(valorBanho);

    }





}

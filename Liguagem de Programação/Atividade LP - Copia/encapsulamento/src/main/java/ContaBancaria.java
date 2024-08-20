public class ContaBancaria {

    // atributos
   private String nomeTitular;
   private Double saldo;

   private String codigoConta;

   private Integer agencia;

    // Construtor é sempre público
    // tem sempre o mesmo nome da classe
    // não tem retorno

    public ContaBancaria(String nomeTitular,  String codigoConta, Integer agencia) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.codigoConta = codigoConta;
        this.agencia = agencia;
    }

    // construtor vazio / null
    public ContaBancaria(){

    }

    // métodos
    void sacar (Double valorSaque){
        if(valorSaque > saldo || valorSaque <=0 ){
            System.out.println("Valor insuficiente para saque");
        } else {
            saldo -= valorSaque;
        }
    }


    // GET = retornar um valor
    // SET = alterar um valor

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String contaConta) {
        this.codigoConta = contaConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
}

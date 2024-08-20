public class ContaBancaria {
    //Atributos:
    private String nomeTitular;
    private Double saldo ;
    private String numeroConta;

    //Construtor: inicializar um objeto
    // é publico por padrão
    // sempre o mesmo nome da classe
    // não possui retorno
    public ContaBancaria(String nomeTitular,
                         String numeroConta) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.numeroConta = numeroConta;
    }
    public ContaBancaria(){

    }

    //Métodos:
    void sacar(Double valorSaque){
        if(valorSaque > 0 && valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println("Saque realizado");
        }else {
            System.out.println("Não é possível sacar");
        }
    }

    // this para referenciar o atributo
    // Padrão get e set
    // get = busca o valor de um atributo
    // set = altera o valor de um atrubuto
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

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}

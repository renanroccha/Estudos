public class ContaBancaria {

    //Atributos

  private  String nomeTitular;

  private  Double saldo;

  private  String numeroConta;

  //construtor:
    //é publico por padrão
    //sempre o mesmo nome da classe

    public ContaBancaria(String nomeTitular, String numeroConta) {
        this.nomeTitular = nomeTitular;
        this.saldo =  0.0;
        this.numeroConta = numeroConta;

    }




    //metodos

    void sacar(Double valorSaque){

        if (valorSaque > 0 && valorSaque <= saldo){
        saldo -= valorSaque;
            System.out.println("Saque Atualizado");
        }else{
            System.out.println("Não é possível sacar");
        }

    }


    // this para referenciar o atributo
    //padrão get e set
    //get = buscar o valor de um atributo
    //set = altera o valor do atributo
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




}

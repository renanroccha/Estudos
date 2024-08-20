public class gerenciarCofrinhos {
    public static void main(String[] args) {


        cofrinhoMeta cofrinho = new cofrinhoMeta();


        cofrinho.descricao =  "aquisição de uma bicicleta nova" ;

        cofrinho.valorDepositado(10.0);


        cofrinho.valorDepositado(20.00);
        System.out.println(String.format("valor deposito: %.2f", cofrinho.numAleatorio, cofrinho.valorDeposito));




    }

}

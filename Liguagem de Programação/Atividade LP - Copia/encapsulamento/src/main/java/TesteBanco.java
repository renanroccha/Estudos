public class TesteBanco {
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria("Maria",  "C001", 1);

        conta01.setAgencia(1);


        System.out.println("Nome:  " + conta01.getNomeTitular());

       ContaBancaria conta02 = new ContaBancaria();


        conta01.sacar(10.5);
        //conta01.saldo += 1000.0;
        //System.out.println("Saldo conta 1: R$" + conta01.saldo);

    }
}

//
public class TesteBanco {


    public static void main(String[] args) {


        ContaBancaria conta01 = new ContaBancaria("Nath", "0123-72");

        conta01.setSaldo(0.0);


      //  ContaBancaria conta02 = new ContaBancaria();




          conta01.sacar(20.00);
      //  conta01.saldo -= 1000.0;
      //  System.out.println("Saldo conta01 " + conta01.saldo);



    }
}

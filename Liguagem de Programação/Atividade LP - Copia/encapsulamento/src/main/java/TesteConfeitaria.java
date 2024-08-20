public class TesteConfeitaria {
    public static void main(String[] args) {

        Bolo bolo1 = new Bolo ("Chocolate", 20.00, 3, 10 );


        // get
        System.out.println(bolo1.getSabor());
        System.out.println(bolo1.getValor());
        System.out.println(bolo1.getQuantidadeVendida());
        System.out.println(bolo1.getQuantidadeEmEstoque());

        // set alterando valor
        bolo1.setSabor("Morango");

        System.out.println(bolo1.getSabor());


    }
}

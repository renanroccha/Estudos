import java.util.Scanner;

public class ExemploVector {


    public static void exibirVetor(Integer[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite " + i);
        }
    }

    public static void main(String[] args) {







        //vetor de objeto







        //vetor de int





        int [] vetor = new int[5];

        vetor[0] = 10;
        vetor[1] = 20;


      //  for (int i = 0; i < vetor.length; i++) {

        //    System.out.println(i);

       // }



        int[] vetorIniciado = {10,20,30,40};

        for (int i = 0; i < vetorIniciado.length; i++) {

            System.out.println(i);

        }

        Scanner leitor = new Scanner(System.in);

        Integer[] vetorDigitar = new Integer[5];

    //    for (int i = 0; i < vetorDigitar.length; i++) {
    //    System.out.println("Digite "+ i);
      //      System.out.println("""
      //              vetor[%d] = %d
   //                 """.formatted(i, vetorDigitar[i]));
       // vetorDigitar[i] =leitor.nextInt();


      exibirVetor(vetorDigitar);

        }








    }


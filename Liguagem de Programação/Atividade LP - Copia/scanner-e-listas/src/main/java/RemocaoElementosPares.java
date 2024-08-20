import java.util.ArrayList;
import java.util.List;

public class RemocaoElementosPares {
    public static void main(String[] args) {

        List <Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);
        numeros.add(12);

// de trás para frente
        for(int i=numeros.size()-1; i>0; i--){
            if(numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
        }
        System.out.println(numeros);

// frente para trás
        for(int i=0; i<numeros.size(); i++){
            if(numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }
        }
       System.out.println(numeros);


    }
}

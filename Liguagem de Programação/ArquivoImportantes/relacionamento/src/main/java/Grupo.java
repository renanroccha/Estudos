import java.util.ArrayList;
import java.util.List;

public class Grupo {

    private String nomeGrupo;

    private List<Contato> contatos;

    public Grupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
        this.contatos =  new ArrayList<>();   // no this cria o new array para receber os valores da lista
    }

    public void adicionar (Contato c){
        contatos.add(c);
    }

    //EXIBIR CONTATOS COM FOR
//    public void exibirContatos(){
//        System.out.println("Contatos:\n");
//        for(int i = 0; i < contatos.size(); i++){
//            Contato contatoDaVez = contatos.get(i);
//            System.out.println(contatoDaVez);
//        }
//    }


    public void exibirContatos(){
        System.out.println("Contatos:\n");
        for(Contato contatoDaVez : contatos){
            System.out.println(contatoDaVez);
        }
    }


    public Contato buscarPeloNome (String nomePesquisado){
        for (Contato contato : contatos) {
            if(contato.getNome().equals(nomePesquisado)){
                return contato;
            }
        }

        return null;
    }



    @Override
    public String toString() {
        return """
                Nome do grupo: %s 
                Lista de contatos: %s
                """.formatted(nomeGrupo, contatos);
    }

    public void remove(Contato c){
        contatos.remove(c);
    }

}

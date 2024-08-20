package school.sptech.projeto_02;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    List<Filme> filmes = (List.of(
            new Filme("Vingadores" , "Irmãos Russos"),
            new Filme("Avatar" , "James Cameron")
    ));


    @GetMapping
    public List<Filme> listar(){
        return filmes;
    }

    @GetMapping("/favorito")
    public  Filme favorito(){
        Filme filme = new Filme("Titanic" , "James Cameron");
        return filme;
    }


    @GetMapping("/{indice}")
    public Filme porIndice(@PathVariable int indice){
        return filmes.get(indice);
    }

    @GetMapping("/{criar}/{nome}/{diretor}")
    public Filme criar(@PathVariable String nome, @PathVariable String diretor ){
        Filme filme = new Filme(nome, diretor);
        filmes.add(filme);
        return filme;
    }

}

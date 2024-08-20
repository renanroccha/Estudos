package school.sptech.projeto_02;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculadoraController {

    //Singleton - É criado uma unica vez
   private int contador;
    @GetMapping("/contar")
    public Integer contar(){
        return  ++ contador;
    }

    @GetMapping("/contar2")
    public Integer contar2(){
        return  ++ contador;
    }


    @GetMapping("/somar/{n1}/{n2}")
    public int somar(@PathVariable int n1, @PathVariable int n2){
        return n1 + n2;
    }


}

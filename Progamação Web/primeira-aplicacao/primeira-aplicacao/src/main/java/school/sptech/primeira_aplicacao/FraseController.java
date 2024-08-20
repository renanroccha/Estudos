package school.sptech.primeira_aplicacao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FraseController {
    @GetMapping
    public String ola(){
        return "Boa Krlh!!";
    }

}



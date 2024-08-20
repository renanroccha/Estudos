package school.sptech.projeto_02;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@Controller
@Component
@Service
@Configuration
@Repository

Componentes de responsabilidade no Spring

 */

//http://localhost:8080

@RestController
@RequestMapping("/frases")
public class FraseController {

// URI = / - barra inicial (não programar no barra se for somente /)

    // URI = /frases


@GetMapping
    public String ola(){
    return "Olá";
}


@GetMapping("/bem-vindo")
    public String ola2(){
    return "Olá Bem-vindo";
}


@GetMapping("/personalizada-nome/{nome}/{sobrenome}")
    public String nome(@PathVariable String nome, @PathVariable String sobrenome){
    return "Bem - Vindo " + nome + sobrenome;
}




}

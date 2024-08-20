package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


        @RestController
        @RequestMapping("/ex-01")
        public class ExercicioFacilController {

            @GetMapping("/{palavra}")
            public boolean exercicioFacil(@PathVariable String palavra) {
                palavra = palavra.toLowerCase();
                int comprimento = palavra.length();

                for (int i = 0; i < comprimento / 2; i++) {
                    if (!palavra.substring(i, i + 1).equals(palavra.substring(comprimento - i - 1, comprimento - i))) {
                        return false;
                    }
                }

                return true;
            }
        }



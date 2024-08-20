package school.sptech.sprint1_nota1.ex3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        ExercicioDificilResponse response = new ExercicioDificilResponse();

        if (n <= 0) {
            response.setEnesimoTermo(0);
            response.setSoma(0);
        } else {
            int enesimoTermo = fibonacci(n);
            int soma = fibonacciSum(n);

            response.setEnesimoTermo(enesimoTermo);
            response.setSoma(soma);
        }

        return response;
    }


    public int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public int fibonacciSum(int n) {
        int sum = 0;
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            sum += b;
            int temp = b;
            b = a + b;
            a = temp;
        }
        return sum;
    }}
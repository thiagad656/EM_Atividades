import java.util.ArrayList;
import java.util.List;

public class Primos {
    
    // Método para encontrar o próximo número primo após 'primo'
    public static int proxPrimo(int primo) {
        int prox = primo + 1;
        while (true) {
            if (isPrimo(prox)) {
                return prox;
            }
            prox++;
        }
    }
    
    // Método para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Método para calcular os fatores primos de 'n'
    public static List<Integer> fatoresPrimos(int n) {
        List<Integer> fatores = new ArrayList<>();
        int primo = 2;
        
        while (primo <= Math.sqrt(n)) {
            if (n % primo == 0) {
                fatores.add(primo);
                n /= primo;
            } else {
                primo = proxPrimo(primo);
            }
        }
        
        if (n > 1) {
            fatores.add(n);
        }
        
        return fatores;
    }
}

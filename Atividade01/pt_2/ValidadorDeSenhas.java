package pt_2;
//import java.util.Scanner;

public class ValidadorDeSenhas {

    // Método para verificar se a senha é válida (divisível por 7)
    public static boolean senhaValida(int senha) {
        return senha % 7 == 0;
    }

    // Método para ajustar a senha até que seja válida
    public static int ajustarSenha(int senha) {
        while (!senhaValida(senha)) {
            senha++;
            try {
                // Pausa de 1 segundo entre cada ajuste
                Thread.sleep(300);
            } catch (InterruptedException e) {
                // Captura e trata a exceção se o sleep for interrompido
                System.out.println("O ajuste da senha foi interrompido.");
                Thread.currentThread().interrupt();
                return senha;
            }
        }
        return senha;
    }

    public static void main(String[] args) {
        int[] senhas = {134, 256, 318, 421, 567, 672, 789, 841, 953, 999};

        for (int senha : senhas) {
            if (senhaValida(senha)) {
                System.out.println("Senha " + senha + " é válida!");
            } else {
                int senhaAjustada = ajustarSenha(senha);
                System.out.println("Senha " + senha + " é inválida! sua nova senha é: " + senhaAjustada);
            }
        }
    }
}

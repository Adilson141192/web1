package academy.devdojo.lacosDeRepeticao.whiles;

import java.util.Scanner;

public class aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);

        while (exibirTelaLogin) {
            System.out.println("Digite seu login:");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha:");
            String passwordDigitado = scanner.nextLine();

            if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("Acesso concedido!");
                exibirTelaLogin = false;
                break;
            }
            System.out.println("Acesso negado!");
        }
    }
}

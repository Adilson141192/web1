package academy.devdojo.estruturasCondicionais.ifselse;

import java.util.Scanner;

public class cadastroLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = input.next();
        if (nome.equals("") ||
                nome.equalsIgnoreCase("admin") ||
                nome.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário inválido");
        } else {
            System.out.println(nome + " cadastrado com sucesso");
        }
    }

    public static class calculadoraImpostoCondicional {
        public static void main(String[] args) {
            float salario = 4400.50F;
            float resultado = 0F;
            String porcentagem = "";

            if (salario > 4500) {
                resultado = salario * 0.3F;
                porcentagem = "30%";
            } else {
                resultado = salario * 0.1F;
                porcentagem = "10%";
            }
            System.out.println("O resultado final é: " + resultado + " com " + porcentagem);
        }
    }
}

package academy.devdojo.estruturasCondicionais.ifselse;

import java.util.Scanner;

public class torneioDeNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva o seu nome: ");
        String nome = input.next();
        System.out.println("Escreva o seu nome: ");
        int idade = input.nextInt();

        String nome2 = null;
        nome = "";
        if(nome2 == null || nome2 == ""){

        }

        if (idade <= 10) {
            System.out.println(nome + " Participará da categoria Infantil");
        } else if (idade >= 11 && idade <= 15) {
            System.out.println(nome + " Participará da categoria Juvenil");
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + " Participará da categoria Pré-adulto");
        } else {
            System.out.println(nome + " Participará da categoria Adulto");
        }
    }
}

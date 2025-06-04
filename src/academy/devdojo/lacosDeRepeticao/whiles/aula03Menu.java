package academy.devdojo.lacosDeRepeticao.whiles;

import java.util.Scanner;

public class aula03Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcao != 3){
            System.out.println("1. Calcular salário");
            System.out.println("2. Depositar salários");
            System.out.println("3. Sair");
            System.out.println("Digite a sua opção");
            opcao = teclado.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}

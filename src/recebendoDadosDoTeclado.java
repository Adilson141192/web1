import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class recebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.println("Digite a sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("O seu nome é: " + nome);
        System.out.println("A sua idade é: " + idade);
    }
}

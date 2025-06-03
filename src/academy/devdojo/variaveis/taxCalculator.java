package academy.devdojo.variaveis;

public class taxCalculator {
    public static void main(String[] args) {
        float salario = 2500.00F;
        float porcentagem = 30F;
        float porcentagemSalario = salario * porcentagem / 100;
        System.out.println(porcentagemSalario);
    }
}

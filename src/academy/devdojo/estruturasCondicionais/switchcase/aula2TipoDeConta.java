package academy.devdojo.estruturasCondicionais.switchcase;

public class aula2TipoDeConta {
    public static void main(String[] args) {
        String conta = "CONTA_POUPANÇA";
        switch (conta) {
            case "CONTA_POUPANÇA":
                System.out.println("0.05");
                break;
            case "CONTA_CORRENTE":
                System.out.println("0.02");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("0.1");
                break;
            default:
                System.out.println("CONTA_INEXISTENTE");
                break;
        }
    }
}

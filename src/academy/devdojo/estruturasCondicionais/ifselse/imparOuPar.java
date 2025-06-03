package academy.devdojo.estruturasCondicionais.ifselse;

public class imparOuPar {
    public static void main(String[] args) {
        int numero = 121212112;
        if (numero % 2 == 0) {
            System.out.println("PAR: " + (numero % 2));
        } else {
            System.out.println("IMPAR: " + (numero % 2));
        }
    }
}

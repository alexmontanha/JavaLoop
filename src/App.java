import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Impressão do dobro de um valor");

        int valor;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Digite um valor: ");
            valor = scanner.nextInt();
            System.out.println("O dobro de " + valor + " é " + (valor * 2) + ".");

            if (valor == 0) {
                System.out.println("Você digitou zero, encerrando o programa.");
            }
        } while (valor != 0);

        valor = 100; 

        while (valor != 0) {
            System.out.println("O valor atual é: " + valor);
            valor--;
        }

        System.out.println("Contagem finalizada.");

        for (int i = 0; i < 100; i++) {
            System.out.println("Contagem: " + i);
        }


        System.out.println("Loop de contagem concluído.");
        System.out.println("Programa finalizado.");

        scanner.close();


    }
}

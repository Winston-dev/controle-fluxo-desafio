import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
            throw new ParametrosInvalidosException();

        } catch (Exception e) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número: " + i);

        }

    }

}

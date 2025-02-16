import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira um segundo valor: ");
        int num2 = scanner.nextInt();

        try {
            contador(num1, num2);  
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } 
            
        scanner.close();
    }

    static void contador(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2)
        throw new ParametrosInvalidosException();

        int iteracoes = num2 - num1;

        for (int i = 1; i <= iteracoes; i++){
            System.out.println(String.format("Imprimindo o número %d", i));
        }
    }
}

import java.util.Scanner;

public class Detetive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda às seguintes perguntas:");
        System.out.print("Telefonou para a vítima? (S/N): ");
        char resposta1 = scanner.next().charAt(0);

        System.out.print("Esteve no local do crime? (S/N): ");
        char resposta2 = scanner.next().charAt(0);

        System.out.print("Mora perto da vítima? (S/N): ");
        char resposta3 = scanner.next().charAt(0);

        System.out.print("Devia para a vítima? (S/N): ");
        char resposta4 = scanner.next().charAt(0);

        System.out.print("Já trabalhou com a vítima? (S/N): ");
        char resposta5 = scanner.next().charAt(0);

        int positivas = 0;
        if (resposta1 == 'S' || resposta1 == 's') positivas++;
        if (resposta2 == 'S' || resposta2 == 's') positivas++;
        if (resposta3 == 'S' || resposta3 == 's') positivas++;
        if (resposta4 == 'S' || resposta4 == 's') positivas++;
        if (resposta5 == 'S' || resposta5 == 's') positivas++;

        if (positivas == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (positivas >= 3 && positivas <= 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (positivas == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }
    }
}

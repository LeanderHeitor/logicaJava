import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Faça um programa que
        //verifique (usando if e else) se
        //uma letra digitada é “F” ou “M”.
        //Conforme a letra escrever: F –
        //Feminino, M- Masculino.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra (F ou M): ");
        char letra = scanner.next().charAt(0);

        if (letra == 'F' || letra == 'f') {
            System.out.println("Feminino");
        } else if (letra == 'M' || letra == 'm') {
            System.out.println("Masculino");
        } else {
            System.out.println("Letra inválida. Digite F ou M.");
        }
    }
}

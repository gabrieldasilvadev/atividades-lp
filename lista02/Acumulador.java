import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fala um numero ai meu patrão:");
        Integer numero = scan.nextInt();

        Integer somaDosNumeros = 0;

        while(numero != 0) {

            somaDosNumeros += numero;
            System.out.println("Ainda não chegamos la, tente novamente!");

            System.out.println("Fala um numero ai meu patrão:");
            numero = scan.nextInt();
        }

        System.out.println("Boa chegou no 0. Toma a soma dos numeros: " + somaDosNumeros);
    }
}

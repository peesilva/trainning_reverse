import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Your word backwards: ");
        String entrada = sc.nextLine();
        sc.close();

        String reverso = inverterString(entrada);

        System.out.println("Invertido: " + reverso);
    }

    public static String inverterString(String str) {
        StringBuilder reverso = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverso.append(str.charAt(i));
        }
        return reverso.toString();
    }
}
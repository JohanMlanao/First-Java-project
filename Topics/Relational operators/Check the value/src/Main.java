import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int chiffre = scanner.nextInt();
        int max = 10;
        int min = 0;
        if (chiffre < max && chiffre > min) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

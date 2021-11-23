import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotel = scanner.nextInt();
        int sum = food*duration + flight * 2 + ((duration - 1) * hotel);
        System.out.println(sum);
    }
}
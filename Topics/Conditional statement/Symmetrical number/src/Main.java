import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int four_digit = sc.nextInt();
        int a = four_digit / 1000;
        int b = four_digit / 100 % 10;
        int c = four_digit % 100 / 10;
        int d = four_digit % 10;
        if (a == d && b == c){
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}
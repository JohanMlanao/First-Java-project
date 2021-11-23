import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        int nums = scanner.nextInt();
        for (int i = 1; i <= nums; i = i + 1) {
            int n = scanner.nextInt();
            if (n % 6 == 0) {
                s = s + n;
            }
        }
        System.out.println(s);
    }
}

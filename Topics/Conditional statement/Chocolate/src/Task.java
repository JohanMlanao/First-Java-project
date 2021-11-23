import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        if (K < N * M && K % N == 0) {
            System.out.println("YES");
        } else if (K < N * M && K % M == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

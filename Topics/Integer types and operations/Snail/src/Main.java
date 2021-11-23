import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int feet = 0;
        int day = 1;
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        while (H < B | A < B) {
            System.out.println("Enter new values for H, A and B");
            H = scanner.nextInt();
            A = scanner.nextInt();
            B = scanner.nextInt();
        }
        while (feet + A < H ){
            feet = feet + A;
            feet = feet - B;
            day = day + 1;
        }
        System.out.println(day);
    }
}


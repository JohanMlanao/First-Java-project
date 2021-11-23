import java.util.Scanner;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String J = "J";
        str = str.toLowerCase();
        J = J.toLowerCase();
        System.out.println(str.startsWith(J));
    }
}
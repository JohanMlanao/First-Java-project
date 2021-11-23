import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_name = sc.nextLine();
        String years = sc.nextLine();
        String cuisine_preference = sc.nextLine();
        System.out.print("The form for " + first_name + " is completed." +
                " We will contact you if we need a chef who cooks "
                + cuisine_preference + " dishes and has " + years +
                " years of experience.");
    }
}
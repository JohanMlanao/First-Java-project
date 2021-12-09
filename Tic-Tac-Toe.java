/* A tic-tac-toe game made with JetBrains Academy

package tictactoe;*/



import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_input = "         ";
        char turn = 'X';

        System.out.println("---------");
        System.out.println("| " + user_input.charAt(0) + " " + user_input.charAt(1) + " " + user_input.charAt(2) + " |");
        System.out.println("| " + user_input.charAt(3) + " " + user_input.charAt(4) + " " + user_input.charAt(5) + " |");
        System.out.println("| " + user_input.charAt(6) + " " + user_input.charAt(7) + " " + user_input.charAt(8) + " |");
        System.out.println("---------");

        char[][] tto = new char[3][3];
        tto[0][0] = user_input.charAt(0);
        tto[0][1] = user_input.charAt(1);
        tto[0][2] = user_input.charAt(2);
        tto[1][0] = user_input.charAt(3);
        tto[1][1] = user_input.charAt(4);
        tto[1][2] = user_input.charAt(5);
        tto[2][0] = user_input.charAt(6);
        tto[2][1] = user_input.charAt(7);
        tto[2][2] = user_input.charAt(8);

        int result_X;
        int result_O;
        int impossible;
        int full_case;

        do {
            boolean isNumeric = false;//This will be set to true when numeric val entered
            int row = 0;
            int col = 0;

            while (!isNumeric) {
                try {
                    System.out.print("Enter the coordinates: ");
                    row = sc.nextInt();
                    col = sc.nextInt();
                    while (row < 1 || row > 3 || col < 1 || col > 3 || (tto[row - 1][col - 1] != '_' && tto[row - 1][col - 1] != ' ')) {
                        if (row < 1 || row > 3 || col < 1 || col > 3 ) {
                            System.out.println("Coordinates should be from 1 to 3");
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                        System.out.print("Enter the coordinates: ");
                        row = sc.nextInt();
                        col = sc.nextInt();
                    }
                    sc.nextLine();
                    isNumeric = true;//numeric value entered, so break the while loop
                } catch (InputMismatchException ime) {
                    //Display Error message
                    System.out.println("You should enter numbers!");
                    sc.nextLine();//Advance the scanner
                }
            }

            tto[row - 1][col - 1] = turn;


            System.out.println("---------");
            System.out.println("| " + tto[0][0] + " " + tto[0][1] + " " + tto[0][2] + " |");
            System.out.println("| " + tto[1][0] + " " + tto[1][1] + " " + tto[1][2] + " |");
            System.out.println("| " + tto[2][0] + " " + tto[2][1] + " " + tto[2][2] + " |");
            System.out.println("---------");

            int count_X = 0;
            int count_O = 0;


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tto[i][j] == 'X') {
                        count_X++;
                    } else if (tto[i][j] == 'O') {
                        count_O++;
                    }
                }
            }
            result_X = 0;
            result_O = 0;
            impossible = 0;
            full_case = 9;

            for (int i = 0; i < 3; i += 1) {
                if (tto[i][0] + tto[i][1] + tto[i][2] == 264 || tto[0][i] + tto[1][i] + tto[2][i] == 264) {
                    result_X += 1;
                } else if (tto[i][0] + tto[i][1] + tto[i][2] == 237 || tto[0][i] + tto[1][i] + tto[2][i] == 237) {
                    result_O += 1;
                }
            }
            if (tto[0][0] + tto[1][1] + tto[2][2] == 264 || tto[2][0] + tto[1][1] + tto[0][2] == 264) {
                result_X += 1;
            } else if (tto[0][0] + tto[1][1] + tto[2][2] == 237 || tto[2][0] + tto[1][1] + tto[0][2] == 237) {
                result_O += 1;
            }
            if (result_X == 1 && result_O == 1 || Math.abs(count_X - count_O) > 1) {
                System.out.println("Impossible");
                impossible += 1;
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tto[i][j] == '_' || tto[i][j] == ' ') {
                        full_case -= 1;
                    }
                }
            }
            if (turn == 'X') {
                turn = 'O';
            } else {
                turn = 'X';
            }
        } while (result_X != 1 && result_O != 1 && impossible != 1 && full_case < 9 );

        if (result_X == 1) {
            System.out.println("X wins");
        } else if (result_O == 1) {
            System.out.println("O wins");
        } else {
            System.out.println("Draw");
        }
    }
}

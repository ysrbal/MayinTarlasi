import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Give number for Line Number:  ");
        int line = input.nextInt();
        System.out.print("Give number for Column Number:  ");
        int column = input.nextInt();
        MineSweeper MineGame = new MineSweeper(line,column);
        MineGame.run();
        }
    }


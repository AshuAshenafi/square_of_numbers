import java.util.Scanner;

public class Squares {
    public static void main(String[] args) {
        int number;


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println(String.format("%s", "======================================================="));
        System.out.println(String.format("%1s %15s %10s %15s %10s", "|", "Number", "|", "Square", "|"));
        System.out.println(String.format("%s", "======================================================="));


        for(int i=1; i <= number; i++){
            int square = i * i;
            System.out.println(String.format("%1s %10s %15s %10s %15s", "|", i, "|", square, "|"));
            System.out.println(String.format("%s", "_______________________________________________________"));


        }

    }
}
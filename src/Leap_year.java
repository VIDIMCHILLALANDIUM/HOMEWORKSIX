import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите год");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " високосный год.");
        } else if (year % 400 == 0){
            System.out.println(year + " високосный год.");
        } else {
            System.out.println(year + " не високосный год.");
        }
    }
}

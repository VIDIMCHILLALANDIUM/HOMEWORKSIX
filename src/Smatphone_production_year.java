import java.util.Scanner;

public class Smatphone_production_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Какая у вас мобильная операционная система? IOS - 0, Android - 1");
        int clientOS = input.nextInt();

        System.out.println("Какого года ваш смартфон?");
        int yearsDevice = input.nextInt();
        int clientDeviceYear = 2015;

        if (clientOS == 0){
            if (yearsDevice >= clientDeviceYear){
                System.out.println("Установите актуальную версию приложения для IOS по этой ссылке: ");
            } else {
                System.out.println("Установите облегченную версию приложения на IOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (yearsDevice >= clientDeviceYear){
            System.out.println("Установите актуальную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установчите облегченную версию на Android по ссылке");
            }
        } else {
            System.out.println("На вашу операционную систему невозможно установить приложение");
        }
    }
}

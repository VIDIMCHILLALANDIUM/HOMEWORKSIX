import java.util.Scanner;

public class Client_OS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Какая у вас мобильная операционная система? IOS - 0, Android - 1");
        int clientOS = input.nextInt();

        if (clientOS == 0){
            System.out.println("Для установки приложения на IOS перейдите по этой ссылке: ");
        } else if (clientOS == 1){
            System.out.println("Для установки приложения на Android перейдите по этой ссылке: ");
        }
    }
}

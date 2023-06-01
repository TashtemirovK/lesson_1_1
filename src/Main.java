import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            String KyrgyzstanBishkekChui;
            final int NUM = -24;
            String world = "black";
            KyrgyzstanBishkekChui = "world";
            System.out.println(world + "" + NUM);
            System.out.println(KyrgyzstanBishkekChui + world);

            if (NUM < 0) {
                System.out.println("Вы сохранили отрицательное число");
            } else if (NUM > 0) {
                System.out.println("Вы сохранили положительное число");
            } else {
                System.out.println("Вы сохранили ноль");
            }

            System.out.println("Введите ваше имя:");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Привет " + name);


        }
    }
}
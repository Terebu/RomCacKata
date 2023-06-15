import java.util.Scanner;

public class calc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение для расчета (например, 2+3):");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("[+\\-*/]");
        if (parts.length != 2) {
            System.err.println("Вы ввели неправильное выражение (должно быть два числа и знак операции между ними).");
            return;
        }
        int num1 = (int) Double.parseDouble(parts[0]);
        int num2 = (int) Double.parseDouble(parts[1]);

        if (num1 > 10) {
            System.err.println("Значение должно быть не больше 10");
        } else {
            if (num2 > 10) {
                System.err.println("Значение должно быть не больше 10");
            } else {

                if (input.contains("+")) {
                    System.out.println(num1 + num2);
                } else if (input.contains("-")) {
                    System.out.println(num1 - num2);
                } else if (input.contains("*")) {
                    System.out.println(num1 * num2);
                } else if (input.contains("/")) {
                    System.out.println(num1 / num2);
                } else {
                    System.err.println("Вы ввели неправильное выражение (должен быть знак операции между числами).");
                }
            }
        }
    }
}
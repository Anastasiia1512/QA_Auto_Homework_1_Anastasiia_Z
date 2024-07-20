import java.util.Scanner;
public class CoffeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість еспресо: ");
        int espresso = scanner.nextInt(); // запам*ятовуємо скільки чашок еспресо
        System.out.println("Введіть кількість лате: ");
        int latte = scanner.nextInt(); // скільки лате
        System.out.println("Введіть кількість капучіно: ");
        int cappuccino = scanner.nextInt();  // скільки капучино
        int costEspresso = 3;
        int costLatte = 4;
        int costCappuccino = 5;
        int totalCost = (espresso * costEspresso) + (latte * costLatte) + (cappuccino * costCappuccino);
        System.out.println("Загальна вартість замовлення: " + totalCost + " доларів.");
    }
}
import java.util.Scanner;//
public class MagicApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть поточну годину (0-23):");
        int hour = scanner.nextInt();
        int energy = 0;
        if (hour >= 6 && hour < 12) {
            energy = 10; // Ранок
        }
        else if (hour >= 12 && hour < 18) {
            energy = 20; // День
        }
        else if (hour >= 18 && hour < 24) {
            energy = 30; //Вечір
        }
        else if (hour >= 0 && hour < 6) {
            energy = 5; //Ніч
        }
        else  {
            System.out.println("Введено некоректну годину.");
            return;
        }
        System.out.println("Ви отримаєте " + energy + " одиниць енергії від магічного яблука.");
    }
}

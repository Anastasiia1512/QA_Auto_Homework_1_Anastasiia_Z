import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть тип страви (1 - закуска, 2 - основна страва, 3 - десерт, 4 - напій): ");
        int dishType = scanner.nextInt();
        String dish;
        switch (dishType) {
            case 1:
                dish = "салат Оселедець під шубою";
                break;
            case 2:
                dish = "Картопля пюре з котлетою";
                break;
            case 3:
                dish = "Тірамісу";
                break;
            case 4:
                dish = "Лимонад";
                break;
            default:
                dish = "Невідомий тип страви";
                break;
        }
        System.out.println("Ваша страва: " + dish);
    }
}

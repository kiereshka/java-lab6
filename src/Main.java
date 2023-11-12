
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        TranslateClass translateClass = new TranslateClass();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello there! Як я можу допомогти Вам?");

        while (true)
        {

            System.out.println("1. Перекласти фразу");
            System.out.println("2. Додати переклад");
            System.out.println("3. Вийти з перекладача");

            System.out.println("Ваш вибір: ");
            int choice = scanner.nextInt(); // зчитуємо відповідь користувача

            scanner.nextLine();

            switch (choice) // обробляємо відповідь користувача
            {
                case 1:
                {
                    System.out.print("Введіть англійське слово, яке потрібно перекласти: ");
                    String englishData = scanner.nextLine();

                    String ukrainianTranslator = translateClass.translate(englishData);
                    System.out.println("\nРезультат: " + ukrainianTranslator);
                    break;
                }
                case 2:
                {
                    System.out.print("Введіть слово англійською: ");
                    String englishWord = scanner.nextLine();

                    System.out.print("Введіть переклад цього слова українською мовою: ");
                    String ukrainianWord = scanner.nextLine();

                    translateClass.addTranslation(englishWord, ukrainianWord);
                    System.out.println("Переклад додано до словника. Гарного користування!");
                    break;
                }
                case 3:
                {
                    System.out.println("Дякуємо за використання перекладача!");
                    System.exit(0);
                }
                default:
                {
                    System.out.println("Такого варіанту не існує. Спробуйте ще раз!");
                }
            }
        }
    }
}




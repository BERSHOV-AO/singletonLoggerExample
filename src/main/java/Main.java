import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Logger logger = Logger.getInstance();
        List<Integer> integerList = new ArrayList<>();
        List<Integer> filterList;

        logger.log("Запуск программы");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка:");
        int sizeList = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений:");
        int upperLimit = scanner.nextInt();

        Random random = new Random();

        for (int i = 0; i < sizeList; i++) {
            integerList.add(random.nextInt(upperLimit));
        }
        logger.log("Создаём и наполняем список");
        System.out.println("Вот случайный список: " + integerList);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра:");
        int filterThreshold = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(filterThreshold);
        filterList = filter.filterOut(integerList);
        logger.log("Прошло фильтр " + filterList.size() + " элемента из " + integerList.size());
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filterList);
        logger.log("Завершаем программу");
    }
}

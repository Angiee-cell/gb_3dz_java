// Задача 4*. Среднее значение массива
// Напишите метод, который принимает массив целых чисел и возвращает
// среднее значение элементов массива, округленное до ближайшего целого
// числа.
// Пример:
// [4, 2, 7, 5, 1]
// Результат:
// 4


import java.util.Arrays;

class AverageCalculator {
    public static int calculateAverage(int[] a) {
        // Напишите свое решение ниже

        if (a.length == 0) return 0;

        int sum = 0;

        for (int num : a) {
            sum += num;
        }
        return (int) Math.round((double) sum / a.length);

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task4 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 2, 7, 5, 1};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        AverageCalculator answer = new AverageCalculator();
        int result = answer.calculateAverage(a);
        System.out.println(result);
    }
}

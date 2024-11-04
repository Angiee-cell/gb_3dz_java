// Задание 1. Удаление отрицательных значений из массива
// Реализуйте метод, который принимает на вход целочисленный массив и
// удаляет все отрицательные числа. Метод должен вернуть массив, содержащий
// только неотрицательные числа.
// Пример:
// [-1, 2, -3, 4, -5, 6]
// Результат:
// [2, 4, 6]


import java.util.ArrayList;
import java.util.Arrays;

class FilterNegative {
    public static int[] filterNegative(int[] a) {
        // Напишите свое решение ниже

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : a) {
            if (num >= 0) {
                result.add(num);
            }
        }
        // Преобразуем ArrayList в массив
        int[] resultArray = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task1 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{-1, 2, -3, 4, -5, 6};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        FilterNegative answer = new FilterNegative();
        String itresume_res = Arrays.toString(answer.filterNegative(a));
        System.out.println(itresume_res);
    }
}
    
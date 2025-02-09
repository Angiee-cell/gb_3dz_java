// Задача 2. Уникальные числа
// Напишите метод, который принимает целочисленный массив и возвращает
// новый массив, содержащий только уникальные элементы из исходного
// массива.
// Пример:
// [1, 2, 2, 3, 4, 4, 5]
// Результат:
// [1, 2, 3, 4, 5]


import java.util.Arrays;
import java.util.ArrayList;

class UniqueElements {
    public static int[] getUniqueElements(int[] a) {
        // Напишите свое решение ниже

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : a) {
            if (!result.contains(num)) {
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
public class task2 {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{1, 2, 2, 3, 4, 4, 5};
        } else {
            a = Arrays.stream(args[0].split(",")).mapToInt(Integer::parseInt).toArray();
        }
        UniqueElements answer = new UniqueElements();
        String itresume_res = Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }
}
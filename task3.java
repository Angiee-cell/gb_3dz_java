// Задача 3. Длина слов
// Реализуйте метод, который принимает на вход массив строк и возвращает
// новый массив, содержащий только строки, длина которых больше 3 символов.
// Пример:
// ["cat", "elephant", "dog", "giraffe"]
// Результат:
// ["elephant", "giraffe"]


import java.util.Arrays;
import java.util.ArrayList;

class FilterStrings {
    public static String[] filterShortStrings(String[] arr) {
        // Напишите свое решение ниже

        ArrayList<String> result = new ArrayList<>();

        for (String s : arr) {
            if (s.length() > 3) {
                result.add(s);
            }
        }
        // Преобразуем ArrayList в массив
        String[] resultArray = new String[result.size()];

        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;

    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task3 {
    public static void main(String[] args) {
        
        String[] arr;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new String[]{"cat", "elephant", "dog", "giraffe"};
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String itresume_res = Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	 int[][] mtx = new int[10][10];          // Создаем матрицу 10 на 10
        Random random = new Random();

        for (int i = 0; i < mtx.length; i++) {         // Перебираем строки  - mtx.length
            for (int j = 0; j < mtx[i].length; j++) {  // Перебираем столбцы - mtx[i].length
                mtx[i][j] = random.nextInt(99);
            }
        }

        // Выводим матрицу
        for (int i = 0; i < mtx.length; i++) {         // Перебираем строки  - mtx.length
            for (int j = 0; j < mtx[i].length; j++) {  // Перебираем столбцы - mtx[i].length
               System.out.print(mtx[i][j] + " ");      // Выводим строку матрицы
            }
            System.out.println();                      // Переходим на новую строку
        }
        System.out.println(mtx[2][8]);

        /*
        Задача найти максимальные элементы в каждой строке и поставить их на позицию номера этой тсоки,
        чтобы по диагонали располагались максимальные элементы
        Решения
        1) Найти максимальное число в строке
        2) Перенести его на номер этой строки
        TODO Сделать так, что максимальное число менялось местами с числом на диагонали
         */

        for (int i = 0; i < mtx.length; i++) {         // Перебираем строки  - mtx.length
            int max = mtx[i][0];                       // Предполагаем, что первое число в строке и есть максимум
            for (int j = 0; j < mtx[i].length; j++) {  // Перебираем столбцы - mtx[i].length
                if (max < mtx[i][j]) {                     // Проверяем больше ли одно из чисел строки предполагаемого максимума
                    max = mtx[i][j];                    // Если да, перезаписываем самое большое число
                }
            }
            mtx[i][i] = max;                        // Располагаем максимальное число на диагонали(2 пункт решения)
        }

        // Выводим матрицу
        for (int i = 0; i < mtx.length; i++) {         // Перебираем строки  - mtx.length
            for (int j = 0; j < mtx[i].length; j++) {  // Перебираем столбцы - mtx[i].length
                System.out.print(mtx[i][j] + " ");      // Выводим строку матрицы
            }
            System.out.println();                      // Переходим на новую строку
        }
    }
}

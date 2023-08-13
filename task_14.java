import java.util.Random;

public class task_14 {
    public static void main(String[] args) {
        int[] array = new int[15];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20;
        }

        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int maxElement = array[0];
        int minElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }

        System.out.println("Максимальный элемент массива: " + maxElement);
        System.out.println("Минимальный элемент массива: " + minElement);

        int maxAbsValue = Math.max(Math.abs(maxElement), Math.abs(minElement));

        System.out.println("Наибольшее по модулю значение: " + maxAbsValue);
    }
}
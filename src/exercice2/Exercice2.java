package exercice2;

import java.util.Arrays;

public class Exercice2 {
    public static <E> void selectionSort(E[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}

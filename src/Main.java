import exercice1.Exercice1;
import exercice2.Exercice2;
import exercice3.Exercice3;
import exercice4.Exercice4;

public class Main {
    public static void main(String[] args) {
        //Exercice 1
        String[] dataString = {"Koffi", "Kouadio", "Zokou"};
        Integer[] dataInt = {1, 2, 3, 4, 5};
        Exercice1.printArray(dataString);
        Exercice1.printArray(dataInt);

        //Exercice 2
        Integer[] dataInt2 = {5, 1, 8, 26, 35, 87, 45, 50, 0};
        Exercice2.selectionSort(dataInt2);

        //Exercice 3
        String word = "HIPPOPOTAMUS";
        Exercice3.reverse(word);

        //Exercice 4
        Exercice4 pi = () -> Math.PI;
        System.out.println("Valeur de PI " + pi.findPi());
    }
}
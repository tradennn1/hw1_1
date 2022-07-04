import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        String myVar = "Hello my dear friend!";
        //2
        final int NUM = 4;
        //3

        String word = "432";
        //5
        System.out.println(myVar + NUM + word);
        //4
        myVar = NUM + word;
        System.out.println(myVar);
        //6
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");

        }
        //789

        System.out.println("Введите ваше имя: ");
        Scanner myTextInput = new Scanner(System.in);
        String myText = myTextInput.next();
        System.out.println("Hello " + myText);


    }


}
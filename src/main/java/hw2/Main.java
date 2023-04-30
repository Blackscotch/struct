package hw2;

import static hw2.NodeList.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        NodeList newList = new NodeList();
        for (int i = 0; i < 15; i++){
            newList.addTail(getRandom());
        }
        System.out.println("Вот список случайных чисел");
        print(newList);
        System.out.println("Развернули список");
        newList.revert();
        print(newList);
        System.out.println("Из развернутого списка создали два новых");
        newList.divideNodeList();
        System.out.println("В имеющийся список продублировали все четные числа");
        newList.duplicateValues();
        print(newList);
    }

    public static int getRandom(){
        int rand = new Random().nextInt(-100, 100);
        return rand;
    }
}

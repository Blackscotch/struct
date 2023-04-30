package hw3;

import java.util.Random;
import static hw3.BlackRadTree.printRBTree;
public class Main {
    public static void main(String[] args){
        BlackRadTree tree = new BlackRadTree();
        for (int i = 0; i < 15; i++){
            tree.add(getRandom());
        }
        printRBTree(tree);
    }
    public static int getRandom(){
        int rand = new Random().nextInt(-100, 100);
        return rand;
    }
}

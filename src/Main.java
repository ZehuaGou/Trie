import java.util.ArrayList;

/**
 * @author Li Ersan
 */
public class Main {

    private static void testTime(Set set) {
        System.out.println("傲慢与偏见");
        ArrayList<String> words = new ArrayList<>();
        if (FileOperation.readFile("pride-and-prejudice.txt", words)) {
            long startTime = System.nanoTime();

            for (String word : words) {
                set.add(word);
            }

            for (String word : words) {
                set.contains(word);
            }

            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1000000000.0;

            System.out.println("不同词汇数量：" + set.getSize());
            System.out.println(set.getClass().getSimpleName() + ": " + time + " s");

        }
    }

    public static void main(String[] args) {
        BSTSet bstSet = new BSTSet();
        testTime(bstSet);

        System.out.println();

        TrieSet trieSet = new TrieSet();
        testTime(trieSet);

    }
}

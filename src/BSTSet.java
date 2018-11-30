import java.util.ArrayList;

/**
 * @author Li Ersan
 */
public class BSTSet<E extends Comparable<E>> implements Set<E> {

    private BST<E> bst;

    public BSTSet() {
        bst = new BST<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.remove(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }

    @Override
    public boolean isEmpty() {
        return bst.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("傲慢与偏见");

        ArrayList<String> words1 = new ArrayList<>();
        if (FileOperation.readFile("pride-and-prejudice.txt", words1)) {
            System.out.println("总共单词数: " + words1.size());

            Set<String> set1 = new BSTSet<>();
            for (String word : words1) {
                set1.add(word);
            }

            System.out.println("共有不同单词数：" + set1.getSize());
        }

        System.out.println();

        System.out.println("双城记");

        ArrayList<String> words2 = new ArrayList<>();
        if (FileOperation.readFile("a-tale-of-two-cities.txt", words2)) {
            System.out.println("总共单词数: " + words2.size());

            Set<String> set2 = new BSTSet<>();
            for (String word : words2) {
                set2.add(word);
            }

            System.out.println("共有不同单词数：" + set2.getSize());
        }
    }
}

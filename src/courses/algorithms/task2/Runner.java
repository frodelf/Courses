package courses.algorithms.task2;

public class Runner {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree('1',
                new BinaryTree('2',
                        new BinaryTree('3', null, null),
                        new BinaryTree('4', null, null)),
                new BinaryTree('5',
                        new BinaryTree('6',
                                new BinaryTree('7', null, null),
                                new BinaryTree('8', null, null)),
                        new BinaryTree('9',
                                null,
                                new BinaryTree('0', null, null))));

        tree.deep();
        tree.wide();
    }
}

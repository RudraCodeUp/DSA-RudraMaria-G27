class TreeCountOperations {

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    int countLeafNodes(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public static void main(String[] args) {
        TreeCountOperations tree = new TreeCountOperations();

        // 🌳 Build Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Total number of nodes: " + tree.countNodes(root));
        System.out.println("Number of leaf (pendant) nodes: " + tree.countLeafNodes(root));
    }
}

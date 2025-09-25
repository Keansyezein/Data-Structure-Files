import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

class BinaryTree {

    Node root;

    public void inorder(Node n, List<Integer> out) {
        if (n == null) {
            return;
        } else {
            inorder(n.left, out);
            out.add(n.data);
            inorder(n.right, out);
        }
    }

    public void preorder(Node n, List<Integer> out) {
        if (n == null) {
            return;
        } else {
            out.add(n.data);
            preorder(n.left, out);
            preorder(n.right, out);
        }
    }

    public void postorder(Node n, List<Integer> out) {
        if (n == null) {
            return;
        } else {
            preorder(n.left, out);
            preorder(n.right, out);
            out.add(n.data);
        }
    }

    public List<Integer> LevelOrder(Node n) {
        List<Integer> out = new ArrayList();

        if (n == null) {
            return out;
        }

        Queue<Node> q = new ArrayDeque<>();
        q.add(n);

        while (!q.isEmpty()) {
            Node cur = q.remove();
            out.add(cur.data);
            if (cur.left != null) {
                q.add(cur.left);
            }
            if (cur.right != null) {
                q.add(cur.right);
            }
        }

        return out;
    }
}

class Main {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        t.root = new Node(10);
        t.root.left = new Node(5);
        t.root.right = new Node(15);
        t.root.left.left = new Node(2);
        t.root.left.right = new Node(7);
        t.root.right.left = new Node(12);

        List<Integer> in = new ArrayList();
        List<Integer> pre = new ArrayList();
        List<Integer> post = new ArrayList();
        List<Integer> Levelorder = t.LevelOrder(t.root);

        t.inorder(t.root, in);
        System.out.println("Inorder: " + in);
        t.preorder(t.root, pre);
        System.out.println("Preorder: " + pre);
        t.postorder(t.root, post);
        System.out.println("Postorder: " + post);

        System.out.println("Levelorder: " + Levelorder);

    }
}


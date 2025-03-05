package Tree;

// Node class represents each node in the tree
class Node {
    int data;
    Node left, right; // pointers to left and right child nodes

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Tree class represents the entire binary tree
class Tree {
    Node root;

    // Constructor to initialize the tree with the root node
    public Tree() {
        root = null;
    }

    // Method to insert a new node into the tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive helper method to insert a new node
    private Node insertRec(Node root, int data) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Otherwise, recurse down the tree
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        // Return the (unchanged) node pointer
        return root;
    }

    // Method to perform inorder traversal of the tree
    public void inorder() {
        inorderRec(root);
    }

    // Recursive helper method for inorder traversal
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left); // Traverse left subtree
            System.out.print(root.data + " "); // Visit node
            inorderRec(root.right); // Traverse right subtree
        }
    }
}

// Main class to test the Tree implementation
public class treeStruct {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // Insert nodes into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print the inorder traversal of the tree
        System.out.println("Inorder traversal of the tree:");
        tree.inorder();
    }
}


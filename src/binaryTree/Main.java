package binaryTree;

    class TreeNode {
        int value;
        TreeNode right, left;


        public TreeNode(int value) {
            this.value = value;
        }

    }
     
    class BinaryTree{
        
        TreeNode root;

        public void insert(int value) {
            root = insertRecursive(root, value);
        }

        private TreeNode insertRecursive(TreeNode node, int value){

            if(node == null) {
                return new TreeNode(value);

            }

            if(value < node.value) {
                node.left = insertRecursive(node.left, value);
            } else if (value > root.value) {
                node.right = insertRecursive(node.right, value);
            }

            return node;

        }

        public void inorder() {
            inorderRec(root);
        }

        private void inorderRec(TreeNode root) {
            if(root != null) {
                inorderRec(root.left);
                System.out.println(root.value + " ");
                inorderRec(root.right);
            }
        }

    }

    public class Main {
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.insert(50);
            tree.insert(30);
            tree.insert(70);
            tree.insert(20);
            tree.insert(40);
            tree.insert(60);
            tree.insert(80);
    
            System.out.println("Traversal in-order:");
            tree.inorder();
        }
    }


public class BinarySearchTree {
    BinaryNode rootNode;
    int depth;
    boolean done = false;
    
    public BinarySearchTree() {
        depth = -1;
        rootNode = null;
    }

    public void printTree(BinaryNode node) {
        if (node == null)
            return;
 
        // First recur on left child
        printTree(node.left);
 
        // Then print the data of node
        System.out.print(node.value + " ");
 
        // Now recur on right child
        printTree(node.right); 
    }

    public void Find(int num) {
        if(depth == -1) {
            throw new IllegalStateException("The tree is empty right now");
        }
    }

    public void add(BinaryNode newNode, BinaryNode node) {
        if(depth == -1) {
            // BinaryNode root = new BinaryNode(num);
            rootNode = newNode;
            node = rootNode;
            depth++;
        }
        else {
            if(newNode.value < node.value) {
                //Need to move left
                if(node.left != null) {
                    node = node.left;
                    add(newNode, node);
                }
                else {
                    //BinaryNode left = new BinaryNode(num);
                    node = node.left;
                    node = rootNode;
                }
            }
            else if(newNode.value > node.value) {
                //Need to move right
                if(node.right != null) {
                    node = node.right;
                    add(newNode, node);
                }
                else {
                    //BinaryNode right = new BinaryNode(num);
                    node = node.right;
                    node = rootNode;
                }
            }
            else {
                //Are the same
                //Going to move left but really my choice
                if(node.left != null) {
                    node = node.left;
                    add(newNode, node);
                }
                else {
                    //BinaryNode middle = new BinaryNode(num);
                    node = node.left;
                    node = rootNode;
                }
            }
            depth++;
        }

    }
/* 
    public BinaryNode remove(int num, BinaryNode node) {
        if (node == null)
            return null;

        //Moving right and left until finding the value needed to be deleted
        if(num < node.value) {
            remove(num, node.left);
        }
        else if(num > node.value) {
            remove(num, node.right);
        }
        else {
            //After finding the value check for children 
            //return if no left and/or right child
            if(node.right == null) {
                return node.left;
            }
            if(node.left == null) {
                return node.right;
            }

            //Want to find smallest value in right subtree to replace deleted node
            //In BST want to provide the smallest number that is larger than the deleted node
            //Now left subtree doesn't change at all
            int replace = node.value;
            for(int i = 0; node.left != null; i++, node = node.left) 
                replace = node.left.value;
            
            remove(replace, node.right);
        }
        return node;
    }
    */
}

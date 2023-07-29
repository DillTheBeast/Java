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
        }
        depth++;

    }

    public BinaryNode remove(int num, BinaryNode node) {
        if (node == null)
            return null;

        if(num < node.value) {
            //Needs to go left
            remove(num, node.left);
        }
        else if(num > node.value) {
            //Needs to go to right
            remove(num, node.right);
        }
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

                BinaryNode current = node;
                while (current.left != null) {
                    current = current.left;
                }
        }
    }
}

        //Only get here once what needs to be deleted is found
        // if(done == true) {
        //     if (node.left == null && node.right == null) {
        //         //No childs meaning it can just be deleted
        //         System.out.println(node);
        //         node = null;
        //         System.out.println(node);
        //     }
        //     else {
        //         //Has children to the right and left
        //         remove(num, node.left);
        //         node = null;
        //         remove(num, node.right);
        //     }
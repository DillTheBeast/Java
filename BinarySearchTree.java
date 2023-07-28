public class BinarySearchTree {
    class BinaryNode {
        int value;
        BinaryNode left;
        BinaryNode right;
    
        public BinaryNode(int value){
            this.value = value;
        }
        
    
        public String toString(){
            return String.valueOf(value);
        }
    }
    BinaryNode rootNode;
    int depth;
    boolean leftempy = false;
    boolean rightempty = false;
    
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

    public void add(int num, BinaryNode node) {
        if(depth == -1) {
            BinaryNode root = new BinaryNode(num);
            rootNode = root;
            node = rootNode;
        }
        else {
            if(num < node.value) {
                //Need to move left
                if(node.left != null) {
                    node = node.left;
                    add(num, node);
                }
                else {
                    BinaryNode left = new BinaryNode(num);
                    node.left = left;
                    node = rootNode;
                }
            }
            else if(num > node.value) {
                //Need to move right
                if(node.right != null) {
                    node = node.right;
                    add(num, node);
                }
                else {
                    BinaryNode right = new BinaryNode(num);
                    node.right = right;
                    node = rootNode;
                }
            }
            else {
                //Are the same
                //Going to move left but really my choice
                if(node.left != null) {
                    node = node.left;
                    add(num, node);
                }
                else {
                    BinaryNode middle = new BinaryNode(num);
                    node.left = middle;
                    node = rootNode;
                }
            }
        }
        depth++;

    }

    public void remove(int num, BinaryNode node) {
        if (node == null)
            return;

        if(num < node.value) {
                //Recurs to left and then returns what needs to be deleted
                if(node.left.value != num) {
                    node = node.left;
                    remove(num, node);
                }
                else {
                    node = node.left;
                }
            }
        else if(num > node.value) {
                //Same thing for right
                if(node.left.value != num) {
                    node = node.right;
                    remove(num, node);
                }
                else {
                    node = node.right;
                }     
        }

        //Only get here once what needs to be deleted is found
        if (node.left == null && node.right == null) {
            //No childs meaning it can just be deleted
            System.out.println(node);
            node = null;
            System.out.println(node);
        }
        else if(node.left != null) {
            //Only has a child to the left
            node = node.left;
            remove(num, node);
        }
        else if(node.right != null) {
            //Only has a child to the right

        }
        else {
            //Has children to the right and left
        }
    }

    //Need to make an array for everything being cut off and then just add those numbers back to the tree

    public void remove() {
    
}

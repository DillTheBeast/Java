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
    BinaryNode placeHolder;
    boolean leftAvailable = true;
    
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

    public void add(int num) {
        if(depth == -1) {
            BinaryNode root = new BinaryNode(num);
            rootNode = root;
            placeHolder = rootNode;
        }
        else {
            if(num < placeHolder.value) {
                //Need to move left
                if(placeHolder.left != null) {
                    placeHolder = placeHolder.left;
                    add(num);
                }
                else {
                    BinaryNode left = new BinaryNode(num);
                    placeHolder.left = left;
                    placeHolder = rootNode;
                }
            }
            else if(num > placeHolder.value) {
                //Need to move right
                if(placeHolder.right != null) {
                    placeHolder = placeHolder.right;
                    add(num);
                }
                else {
                    BinaryNode right = new BinaryNode(num);
                    placeHolder.right = right;
                    placeHolder = rootNode;
                }
            }
            else {
                //Are the same
                //Going to move left but really my choice
                if(placeHolder.left != null) {
                    placeHolder = placeHolder.left;
                    add(num);
                }
                else {
                    BinaryNode middle = new BinaryNode(num);
                    placeHolder.left = middle;
                    placeHolder = rootNode;
                }
            }
        }
        depth++;

    }

    public void remove(int num) {
        if(num <= placeHolder.value) {
                //Need to move left
                if(placeHolder.left.value != num) {
                    placeHolder = placeHolder.left;
                    remove(num);
                }
                else {
                    BinaryNode left = new BinaryNode(num);
                    placeHolder.left = left;
                    placeHolder = rootNode;
                }
            }
            else if(num > placeHolder.value) {
                //Need to move right
                if(placeHolder.right.value != num) {
                    placeHolder = placeHolder.right;
                    remove(num);
                }
                else {
                    BinaryNode right = new BinaryNode(num);
                    placeHolder.right = null;
                    placeHolder = rootNode;
                }
    }



}

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

    public void printTree(BinaryNode direction) {
        if(depth == -1) {
            System.out.println("There is nothing to print");
        }
        else if(depth == 0){
            System.out.println(rootNode.value);
        }
        else{
            // if(placeHolder.left != null && direction == placeHolder.left) {
            //     placeHolder = placeHolder.left;
            //     printTree(placeHolder.left);
            // }
            // else {
            //     System.out.println(placeHolder);
            // }

            // if(placeHolder.right != null && direction == placeHolder.right) {
            //     placeHolder = placeHolder.right;
            //     printTree(placeHolder.right);
            // }
            // else {
            //     System.out.println(placeHolder);
            // }

            while(placeHolder.left != null) {
                placeHolder = placeHolder.left;
                printTree(placeHolder);
            }
            //System.out.println(placeHolder.value);
            while(placeHolder.right != null) {
                placeHolder = placeHolder.right;
                printTree(placeHolder);
            }
            System.out.println(placeHolder.value);

        }
        
    }

    public void Find(BinaryNode num) {
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

}

public class BinarySearchTree {
    BinaryNode rootNode;
    int firstNode;
    BinaryNode placeHolder;
    boolean leftAvailable = true;
    BinaryNode last;
    
    public BinarySearchTree(/*BinaryNode rootNode*/) {
        
    }

    public void printTree(BinaryNode node) {
        if(firstNode == 0) {
            System.out.println("There is nothing to print");
        }
        printTree(node.left);
        System.out.println(node.value);
        printTree(node.right);
    }

    public void Find(BinaryNode num) {
        if(firstNode == 0) {
            throw new IllegalStateException("The tree is empty right now");
        }
    }

    public void Add(BinaryNode num) {
        if(firstNode == 0) {
            num = rootNode;
            placeHolder = rootNode;
            firstNode++;
        }
        else {
            if(num.value < placeHolder.value) {
                //Need to move left
                if(placeHolder.left != null) {
                    placeHolder = placeHolder.left;
                    Add(num);
                }
                else {
                    placeHolder.left = num;
                    placeHolder = rootNode;
                }
            }
            else if(num.value > rootNode.value) {
                //Need to move right
                if(placeHolder.right != null) {
                    placeHolder = placeHolder.right;
                    Add(num);
                }
                else {
                    placeHolder.right = num;
                    placeHolder = rootNode;
                }
            }
            else {
                //Are the same
                //Going to move left but really my choice
                if(placeHolder.left != null) {
                    placeHolder = placeHolder.left;
                    Add(num);
                }
                else {
                    placeHolder.left = num;
                    num.right = placeHolder;
                    placeHolder = rootNode;
                }
            }
        }

    }

}

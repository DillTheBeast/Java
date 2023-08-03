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

    public void oldAdd(BinaryNode newNode, BinaryNode node) {
        if(depth == -1) {
            // BinaryNode root = new BinaryNode(num);s
            rootNode = newNode;
            node = rootNode;
            depth++;
        }
        else {
            if(newNode.value < node.value) {
                //Need to move left
                if(node.left != null) {
                    node = node.left;
                    oldAdd(newNode, node);
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
                    oldAdd(newNode, node);
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
                    oldAdd(newNode, node);
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

    public BinaryNode remove(BinaryNode node,int value)
   {
       if(node==null) 
       return node;
       if(value > node.value) //if value if greater than current value
           node.right=remove(node.right,value);
        else if(value < node.value)
           node.left = remove(node.left, value);
       else 
       {
       //if node having max one child
       if(node.left==null)    
           return node.right;
       else if(node.right==null)
           return node.left;
       // if node having two children then get the inorder predecessor of node
       node.value=minimumValue(node.left);
       //delete the inorder predecessor
        node.left=remove(node.left,node.value);  
        }
       return node;
   }

   public int minimumValue(BinaryNode ptr)
   {
       int min;
       for(min=ptr.value;ptr.right!=null;ptr=ptr.right)
       min=ptr.right.value;
       return min; 
   }

}

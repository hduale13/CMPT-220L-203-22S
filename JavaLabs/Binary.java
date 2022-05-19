
class Node
{
    Node left;
    Node right;
    int data;
}

class BST
{
    public Node createNode(int x){
        Node a = new Node();

        a.left = null;
        a.right = null;

        a.data = x;
        
        return a;
    }
        
    Node insert(Node node, int val)
    {
        if(node == null) 
        {
            return createNode(val);
        }

        if(val < node.data) 
        {
            node.left = insert(node.left, val);
        }

        else if(val > node.data) 
        {
            node.right = insert(node.right, val);
        }
        return node;

    }

    Node delete(Node node, int val) 
    {
        if (node == null) 
        {
            return null;
        }
        
        if (val < node.data) 
        {
            node.left = delete(node.left, val);

        }
        else if (val > node.data) 
        {
            node.right = delete(node.right, val);
        }
        else 
        {
            if(node.left == null || node.right == null) 
            {
                Node temp = null;
                temp = node.left == null ? node.right : node.left;

                if(temp == null) 
                {
                    return null;
                }
                else
                { 
                    return temp;
                }
            }
            else 
            {
                Node successor = getSuccessor(node);
                node.data = successor.data;
                node.right = delete(node.right, 4);
            }
        }
        return node; 
    }

    //calls upon the next number in sequence when deleting from array
    Node getSuccessor(Node node) 
    {
        if (node == null) 
        {
            return null;
        }
        Node temp = node.right;

        while(temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    //printing array inorder
    public void inorder(Node node){
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.println(node.data + " ");
        inorder(node.right);
    } 
// prints array in preorder
    public void preorder(Node node){
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }
// prints array in postorder

    public void postorder(Node node){
        if (node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);

    }

    public boolean ifNodePresent(Node node, int val) {
        if(node == null){
            return false;
        }
        boolean isPresent = false;
        while(node != null) 
        {
            if (val < node.data){
                node = node.left;
            }
            else if (val > node.data) {
                node = node.right;
            }
            else {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    public int getMax(Node node){
        if (node == null) {
            System.out.println("Tree is empty");
            return -1;
        }

        while(node.right != null) {
            node = node.right;
        }

        return node.data;
    }

    public int getMin(Node node){
        if (node == null) {
            System.out.println("Tree is empty");
            return -1;
        }

        while(node.left != null) {
            node = node.left;
        }

        return node.data;
    }

    static boolean Contains(Node root, int value)
    {
        while(root != null)
        {
            if(root.Value == value) 
                return true;
            if(root.Value > value) 
                root = root.Left;
            else 
                root = root.Right;
        }

        return false;
    }
}  



public class Binary
{
    public static void main(String[] args)
    {
        BST a = new BST();
        Node root = null;
//array
        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);


        //print array inorder
        System.out.println("Array in inorder:");
        a.inorder(root);
        System.out.println(" ");

        //prints array in preorder
        System.out.println("Array in preorder:");
        a.preorder(root);
        System.out.println(" ");

        //prints array in postorder
        System.out.println("array in postorder: ");
        a.postorder(root);

        //You can change the first val to root or to null, and the second val 
        //to any number you want to check that is in the BST
        System.out.println(a.ifNodePresent(root, 3));

        //Function for getting max value
        System.out.println("The max in the tree is: ");
        System.out.print(a.getMax(root));
        System.out.println(" ");

        //Function for getting min value
        System.out.println("The min in the tree is: ");
        System.out.print(a.getMin(root));
        //
    }

}
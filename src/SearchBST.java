public class SearchBST {
    //tree node
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val, Node left, Node right){
         this.val = val;
         this.left = left;
         this.right = right;
        }
    }
    //search the node
    static Node searchBST(Node root, int target){
        if(root == null) return null;

        Node current = root;
        //as its bst so will search left for the small elements and right for the larger ones
        while(current != null){
            if(current.val > target){
                current = current.left;
            }else if(current.val <target){
                current = current.left;
            }else if(current.val == target){
                return current;
            }
        }// we could return null too but for the clarity purposes will return current
        return current;
    }
    /* This will be the other way to do the program , it is a recursive program
    static Node searchBST(Node root, int target){
    if(root== null){
    return null;
    }

    Node current = root;
    if(root.val > target){
    current = searchBST(current.left, target);
    }
    else if(root.val <target){
    current = searchBST(current.right, target);
    }
    else if(current.val == target){
    current = root;
    }

  return current;

    }


     */





    public static void main(String[] args) {

    }
}

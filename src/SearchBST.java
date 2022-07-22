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



    public static void main(String[] args) {

    }
}

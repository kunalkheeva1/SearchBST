public class SearchBST {

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
    static Node searchBST(Node root, int target){
        if(root == null) return null;

        Node current = root;
        while(current != null){
            if(current.val > target){
                current = current.left;
            }else if(current.val <target){
                current = current.left;
            }else if(current.val == target){
                current = root;
            }
        }return current;
    }



    public static void main(String[] args) {

    }
}

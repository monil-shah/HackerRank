//CheckBST
/*class Node {
       int data;
       Node left;
       Node right;
    }
*/
   boolean checkBSTNode(Node root, int min, int max){
       if(root == null){
           return true;
       }
       if(root.data > max || root.data < min)
       {
           return false;
       }
       return checkBSTNode(root.left,min,root.data-1) && checkBSTNode(root.right,root.data+1,max);

   }
   boolean checkBST(Node root) {
       return checkBSTNode(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
   }

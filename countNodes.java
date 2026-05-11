public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=countNodes(root.left);
        int rightCount=countNodes(root.right);
        return leftCount+rightCount+1;
    }

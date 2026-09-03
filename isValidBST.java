public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        //right subtree part
        if(min!=null && root.data<=min.data){
            return false;
        }//left subtree part
        else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }

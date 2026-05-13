public static boolean isIdentical(Node node,Node subroot){
        if(node==null && subroot==null){
            return true;
        }else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }

        if(!isIdentical(node.left,subroot.left)){
            return false;
        }
        if(!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }

public static void klevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data +" ");
            return;
        }
        klevel(root.left,level+1,k);
        klevel(root.right,level+1,k);
    }

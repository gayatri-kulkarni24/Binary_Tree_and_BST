public static Node delete(Node root,int val){
        if(root.data > val){
            root.left=delete(root.left,val);
        }else if(root.data < val){
            root.right=delete(root.right,val);
        }else{
            //case 1-no child
            if(root.left==null && root.right==null){
                return null; //to the parent
            }
            //case 2-one child
            if(root.left==null){
                return root.right; //to the parent
            }else if(root.right==null){
                return root.left; //to the parent
            }

            //case 3: both child
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }

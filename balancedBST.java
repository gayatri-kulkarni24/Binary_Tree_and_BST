public static void getInorder(Node root,ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left,inorder);
        inorder.add(root.data);
        getInorder(root.right,inorder);
    }
    public static Node createBSTfromAL(ArrayList<Integer> inorder,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(inorder.get(mid));
        root.left=createBSTfromAL(inorder,start,mid-1);
        root.right=createBSTfromAL(inorder,mid+1,end);
        return root;
    }
    public static Node balancedBST(Node root){
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root,inorder);
        root=createBSTfromAL(inorder,0,inorder.size()-1);
        return root;
    }

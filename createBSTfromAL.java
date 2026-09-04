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

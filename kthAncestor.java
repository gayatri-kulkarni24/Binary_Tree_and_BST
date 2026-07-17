public static int kthAncestor(Node root,int n,int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int left=kthAncestor(root.left,n,k);
        int right=kthAncestor(root.right,n,k);
        if(left==-1 && right==-1){
            return -1;
        }
        int max=Math.max(left,right);
        if(max+1==k){
            System.out.println("Kth ancestor="+root.data);
        }
        return max+1;
    }

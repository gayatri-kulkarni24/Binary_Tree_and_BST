    public static int SumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=SumOfNodes(root.left);
        int rightSum=SumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

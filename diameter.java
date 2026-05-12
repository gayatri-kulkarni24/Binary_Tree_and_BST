    public static int diameter(Node root){ //diameter=no.of nodes of longest path between two leaves
        if(root==null){
            return 0;
        }
        int leftHt=height(root.left);
        int rightHt=height(root.right);
        int leftDiam=diameter(root.left);
        int rightDiam=diameter(root.right);
        int selfDiam=leftHt + rightHt + 1;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }
